public class node {
        String data;
        node nextNode;
        node(String inData)
        {
            data = inData;
            nextNode = null;
        }
        @Override
        public String toString(){
            return data;
        }
}
