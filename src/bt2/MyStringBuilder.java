package bt2;

/**
 *
 * @author TRONG
 */
public class MyStringBuilder {
 String str;
    protected MyStringBuilder (Builder builder){
        this.str = builder.str;
    }

    @Override
    public String toString() {
        return "MyStringBuilder{" + " str = " + str + '}';
    }
            
    public  static  class Builder {
        String str;

        public Builder() {
        }
        public  Builder addString(String s){
            this.str += s;
            return this;
        }
        public Builder addfloat (float f){  
            this.str += Float.toString(f);
          return this;
        }
        public Builder addBoolean (Boolean b){
            this.str += Boolean.toString(b);
            return this;
        } 
        public MyStringBuilder build(){
            return new MyStringBuilder(this);
        }
    }
}
