/**
 * Created by Nathan on 2/21/2016.
 */
public class LinkedList {

    //constructor
    public LinkedNode firstNode;
    LinkedList(){
        firstNode = null;

    }//end list constructor

    public boolean isEmpty(){

        return (firstNode == null);

    }//end isEmpty

    public void insertFirstLink(String courseName, int courseNum){

        LinkedNode newLinkedNode = new LinkedNode(courseNum,courseName);
        // connects the first link field to the new LinkedNode

        newLinkedNode.next = firstNode;
        firstNode = newLinkedNode;
    }//end insertFirstLink

    public LinkedNode removeFirst(){
        LinkedNode linkReference = firstNode;

        if(!isEmpty()){
            firstNode =firstNode.next;
        }//end if

        else{
            System.out.println("Empty Linked LinkedList");

        }//end else

        return linkReference;

    }//end removeFirst

    public void conDisplay(){

        LinkedNode theLink = firstNode;
        //Start at the reference stored in firstLink and keep getting the refernces stored in next for
        // every linkNode until next returns null

        while (theLink != null) {
            theLink.conDisplay();

            System.out.println("Next LinkNode: " + theLink.next);

            theLink = theLink.next;

            System.out.println();
        }//end while

    }//end conDisplay

    public LinkedNode find(String courseName){

        LinkedNode theLink = firstNode;

        if(!isEmpty()){
          while (theLink.getCourseName()!= courseName) {
              //checks if at the end of the LinkedList

              if (theLink.next== null){
                  // you made it to the end of the list and did not find your match
                  return null;
              }//end inner if
              else{
                  // Found a matching LinkNode in the list
                  theLink =theLink.next;

              }// end else
          }//end while

        }//end outer if
        else{
            System.out.println("No Node in this list");

        }//end else

        return theLink;

    }//end find

    public LinkedNode RemoveLink(String courseName){
        LinkedNode currentNode = firstNode;
        LinkedNode previousNode = firstNode;

        //Keep searching as long as you have not found the LinkedNode
        while(currentNode.getCourseName()!= courseName){
            //check if at the last link in the list

            if (currentNode== null){
                //courseName not found
                return null;
            }//end if
            else{
                //We checked this node mover to next
                previousNode = currentNode;
                currentNode = currentNode.next;

            }//end else

        }//end while

        if(currentNode== firstNode){
            //if you are here that means there was a match in the reference stored in firstLink in the list so go to the next Node
            firstNode= firstNode.next;
        }//end if

        else{
            //If the program is here there was a match in a Node other than the firstlink. Assign the value of next for the Node
            // you want to delete to the Node that's next perviously pointed to the reference to remove

            System.out.println("Node found");
            System.out.println("CurrentNode: "+currentNode);
            System.out.println("firstNode"+ firstNode);

            previousNode.next = currentNode.next;

        }//end else

        return currentNode;

    }//end RemoveLink




}//end class LinkedList
