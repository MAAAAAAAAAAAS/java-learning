public static void main(String[] args) {
    String s = "Java";
    s = s + "!";
    StringBuilder sb = new StringBuilder("Java");
    sb.append("!");
    sb.insert(0, "I love ");
    sb.reverse();
    System.out.println(sb.toString());
    System.out.println(s.length());
    System.out.println(s.charAt(0));
    System.out.println(s.substring(0,3));
    System.out.println(s.toLowerCase());
    System.out.println(s.toUpperCase());
    System.out.println(s.equals("Java!"));
    System.out.println(s.replace("Java", "Yava"));
    System.out.println(s.contains("!"));
    s.trim();
}