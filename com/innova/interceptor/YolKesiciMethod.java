package com.innova.interceptor;

@YolKesiciInterface
@Interceptor
public class YolKesiciMethod {

    @AroundInvoke
    public Object aroundInvoke(InvocationContext context) throws Exception {

        System.out.println("önceki durumum " + context.getMethod().getName() + " " + context.getClass());

        boolean isLogin = false;
        Object isContinue = null;
        if (isLogin) {
            System.out.println("Öncelikle üye olunuz !!! üye sayfasına yönlendiriliyorsunuz");
            return null;
        } else {
            try {
                isContinue = context.proceed();
                System.out.println(" Login olduuktan sonra : Yönlendirme yapılıyor ADmin sayfasına gidiyorsunuz");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return isContinue;
    }

}