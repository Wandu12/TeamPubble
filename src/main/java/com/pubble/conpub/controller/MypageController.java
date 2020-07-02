package com.pubble.conpub.controller;

import com.pubble.conpub.domain.Member;
import com.pubble.conpub.service.MemberService;
import com.pubble.conpub.service.MileageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class MypageController {
    /*@Autowired
    private Member member;*/

    @Autowired
    private MemberService memberService;

    //메인페이지
    @GetMapping("/index")
    public String index(Model model) {
        return "index";
    }

    //마이페이지 매핑
    @GetMapping({"/mypage", "/shoppingInfo"})
    public String mypage(Model model, @RequestParam("id") String id) { //, @RequestParam("id") String id

        /*

        //필요한 처리
        List<Order> orderList = orderService.getOrderList(id);
        String alias = selectedOptionService.getAlias(id);
        //이거 id로 받는 게 아니라 주문번호로 받아야 함. 주문번호를 어디서 받아오지?
        //0. 세션을 통해 유저아이디를 가져오고 이 유저아이디를 통해 Member를 가져옴
        //1. Member를 통해 옵션선택테이블의 ORDER_NO를 구할 수 있음. (이거 여러개 있을 수 있으니 List인가?)
        //2. 이 ORDER_NO를 통해 ORDER 테이블의 ORDER_NO를 가져온다 (ORDER_NO끼리는 1:1이니까 괜찮나..? 여러 개 있으면?)
        //2. 주문번호를 통해 주문번호(만든 메서드 수정 필요)

        //ORDERS 테이블의 해당 컬럼들을 받아옴
        //ORDER_NO ORDER_STATUS ORDER_DATE
        //orderList를 model을 이용해 뷰로 보냄
        model.addAttribute("orderList", orderList);

        //	SELECTED_OPTION 테이블 ALIAS 컬럼 받아옴
        model.addAttribute("alias", alias);



         */
        return "mypage/myShoppingInfo";
    }
    @GetMapping("/cart")
    public String cart(Model model, @RequestParam("id") String id) {
        //필요한 처리

        return "mypage/myCart";
    }

    @GetMapping("/updateInfo")
    public String updateInfo(Model model, @RequestParam("id") String id) {
        return "mypage/updateMyInfo";
    }

    @GetMapping("/updateInfo-check")
    public String updateInfoCheck(Model model) { //, @RequestParam String id, @RequestParam String pwd
        //비밀번호가 일치하는지 확인
        /*
        boolean result = memberService.checkPassword(id, pwd);

        //일치하면 수정 처리 후 마이페이지로 리다이렉트
        if(result) {
            memberService.updateMember(id); //수정가능한 사항: 비밀번호,
            return "redirect:/mypage/updateInfo";
        }
        */
        //일치하지 않으면 '비밀번호를 올바르게 입력해주세요' 출력


       //회원정보를 model 에 저장

        return "mypage/updateMyInfo";
    }

    @GetMapping("/unsubscribe")
    public String unsubscribe(Model model, @RequestParam("id") String id) {
        return "mypage/unsubscribe";
    }

    @GetMapping("/unsubscribe-check")
    public String unsubscribeCheck(Model model, HttpSession session, @RequestParam("id") String id) {
        //삭제
        memberService.deleteMember(id);
        //세션 무효화
        session.invalidate();

        return "index";
    }

}
