package FactoryMethod;
/*
Factory Pattern 은 생성 패턴(Creational Pattern)에 속하며, 
객체를 생성하는 작업을 하위 클래스에 위임하거나 추상화하여 객체 생성 로직과 클라이언트 코드를 분리하는 데 사용됨.

구조
Creator: 제품 객체를 반환하는 팩토리 메서드를 선언하는 추상 클래스 또는 인터페이스. 이 클래스는 팩토리 메서드의 호출을 사용하는 다른 메서드를 포함할 수 있음.
ConcreteCreator: 팩토리 메서드를 오버라이드하여 구체적인 제품 인스턴스를 반환.
Product: 팩토리 메서드가 생성할 객체의 인터페이스.
ConcreteProduct: Product 인터페이스를 구현하는 실제 객체.

장점: 새로운 제품 유형이 추가되어도 기존 Creator 코드를 수정할 필요 없이 새로운 ConcreteCreator만 추가하면 되므로 개방-폐쇄 원칙(OCP)을 준수.

팩토리 패턴의 사용 목적 및 효과
객체 생성의 분리 및 캡슐화: 클라이언트 코드가 어떤 구체적인 클래스의 인스턴스를 생성하는지 알 필요가 없게 만들어 결합도를 낮춤.
유연성 향상: 시스템이 구체적인 클래스 이름에 의존하지 않고, 추상화된 인터페이스에 의존하게 되어 코드 변경에 유연하게 대응할 수 있음.
확장성: 새로운 제품 클래스를 추가하기 쉬움. Creator는 건드리지 않고 새로운 ConcreteCreator만 추가하면 됨.

*/
public class MainEntry {
    public static void main(String[] args) {
        Factory factory = new ItemFactory();

        Item item1 = factory.create("sword");
        if (item1 != null) item1.use();

        Item item2 = factory.create("sword");
        if (item2 != null) item2.use();

        Item item3 = factory.create("sword");
        if (item3 != null) item3.use();

        Item item4 = factory.create("sword");
        if (item4 != null) item4.use();

        Item item5 = factory.create("sword");
        if (item5 != null) item5.use();


    }
}
