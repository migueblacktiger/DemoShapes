public  class Square  extends Shape{
    private int width=0;
    
    public Square(int newWidht){
      setWidth (newWidht);
    }

    public int getHeight() {
        return width;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int newWidth){
      width = newWidth;
      
    }
    public void setheight(int newheight){
      
        width= newheight;
      }
    @Override
    public float getArea() {
      return getWidth()*getWidth();
    }
    @Override
    public int getPerimeter() {
      return getWidth()*getWidth();
    }
}
