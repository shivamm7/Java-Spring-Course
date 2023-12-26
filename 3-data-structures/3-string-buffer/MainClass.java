class MainClass{
    public static void main(String args[]){

        StringBuffer sb = new StringBuffer("tensor");

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("board");
        System.out.println(sb);

        String s = sb.toString();
        System.out.println(s);

    }
}