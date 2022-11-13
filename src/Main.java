public class Main {
    public static void main(String[] args) {

        //case 1
        System.out.println("Case 1");

        var dog=8;
        var cat=3.6;
        var paper=763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //case 2
        System.out.println("Case 2");

        dog=dog+4;
        cat=cat+4;
        paper=paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // case3
        System.out.println("Case 3");

        dog= (int) (dog-3.5);
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //case 4
        System.out.println("Case 4");

        var friend=19;
        System.out.println(friend);
        friend+=2;
        System.out.println(friend);
        friend/=7;
        System.out.println(friend);

        //case 5
        System.out.println("case 5");

        var frog = 3.5;
        System.out.println(frog);
        frog*=10;
        System.out.println(frog);
        frog/=3.5;
        System.out.println(frog);
        frog+=4;
        System.out.println(frog);

        //case 6
        System.out.println("case 6");

        var boxer1Weight=78.2;
        var boxer2Weight=82.7;
        System.out.println("Общий вес боксёров: "+(boxer1Weight+boxer2Weight));
        System.out.println("Разница в весе боксёров: "+(boxer2Weight-boxer1Weight));

        // case 7
        System.out.println("case 7");

        System.out.println("Разница в весе боксёров (способ 1) : "+(boxer2Weight - boxer1Weight));
        System.out.println("Разница в весе боксёров (способ 2) : "+(boxer2Weight % boxer1Weight));

        // case 8
        System.out.println("case 8");

        var totalWorkingHours = 640;
        var workingHours = 8;
        var totalEmployees=totalWorkingHours / workingHours;
        System.out.println("Всего работников в компании- "+(totalEmployees)+" "+"человек");

        totalEmployees=totalEmployees+94;
        totalWorkingHours=totalEmployees*workingHours;
        System.out.println("Если в компании работает"+" "+totalEmployees+" "+"человека, то  всего"+" "+
                totalWorkingHours+" "+"часа работы может быть поделено между сотрудниками");
    }
}