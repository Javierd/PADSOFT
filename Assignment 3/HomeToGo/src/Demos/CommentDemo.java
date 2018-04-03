package Demos;

import Comment.*;
import User.RegisteredUser;
import User.UserType;;

public class CommentDemo {
	private static ChangeComment cComment;
	private static Rating rating;
	private static TextComment tComment;
	private static RegisteredUser user;
	
	public void main() {
		System.out.println("This demo test the funcionality of the Comment class.");
		System.out.println("We create the different types of comments and then we print them to assure they were correctly initialised and that the toString() method is correct.");
		
		System.out.println("We create a ChangeComment with data: Explanation of the needed changes.");
		cComment = new ChangeComment("Explanation of the needed changes");
		System.out.println("The created ChangeComment is: " + cComment +".");
		System.out.println("We create a RegisteredUser in order to create a Rating and a TextComment with data: 112, Pedro, Lopez, 1234567890123456, Hello world, UserType.BOTH.");
		user = new RegisteredUser("112", "Pedro", "Lopez", "1234567890123456", "Hello world", UserType.BOTH);
		System.out.println("The created RegisteredUser is: " + user +".");
		System.out.println("We create a Rating with data: 4, user");
		rating = new Rating(4, user);
		System.out.println("The created Rating is: " + rating +".");
		System.out.println("We create a TextComment with data: Comentario de prueba, user");
		tComment = new TextComment("Comentario de prueba", user);
		System.out.println("The created TextComment is: " + tComment +".");
		
		System.out.println("We check the functionality of equals() method.");

		/*Check functionality of ChangeComment equals*/
		if(cComment.equals(cComment)){
			System.out.println("ChangeComment is equal to itself.");
		}else {
			System.out.println("ChangeComment is not equal to itself, error in equals() of ChangeComment.");
		}
		
		if(cComment.equals(null) == false){
			System.out.println("ChangeComment is not equal to null.");
		}else {
			System.out.println("ChangeComment is equal to null, error in equals() of ChangeComment.");
		}
		
		if(cComment.equals(new ChangeComment("Explanation of the needed changes"))){
			System.out.println("ChangeComment is equal to another ChangeComment with the same information.");
		}else {
			System.out.println("ChangeComment is not equal to another ChangeComment with the same information, error in equals() of ChangeComment.");
		}
		
		/*Check functionality of Rating equals*/
		if(rating.equals(rating)){
			System.out.println("Rating is equal to itself.");
		}else {
			System.out.println("Rating is not equal to itself, error in equals() of Rating.");
		}
		
		if(rating.equals(null) == false){
			System.out.println("Rating is not equal to null.");
		}else {
			System.out.println("Rating is equal to null, error in equals() of Rating.");
		}
		
		if(rating.equals(new Rating(4, user))){
			System.out.println("Rating is equal to another Rating with the same information.");
		}else {
			System.out.println("Rating is not equal to another Rating with the same information, error in equals() of Rating.");
		}
		
		/*Check functionality of TextComment equals*/
		if(tComment.equals(tComment)){
			System.out.println("TextComment is equal to itself.");
		}else {
			System.out.println("TextComment is not equal to itself, error in equals() of TextComment.");
		}
		
		if(tComment.equals(null) == false){
			System.out.println("TextComment is not equal to null.");
		}else {
			System.out.println("TextComment is equal to null, error in equals() of TextComment.");
		}
		
		if(tComment.equals(new TextComment("Comentario de prueba", user))){
			System.out.println("TextComment is equal to another TextComment with the same information.");
		}else {
			System.out.println("TextComment is not equal to another TextComment with the same information, error in equals() of TextComment.");
		} 
		
		/*Check functionality of TextComment answerComment*/
		System.out.println("We check the functionality of the answerComment() method of TextComment.");
		System.out.println("We create a second user in order to create an answer, with data: 113, Maria, Ramirez, 1234567890123457, Goodbye world, UserType.BOTH.");
		RegisteredUser user2 = new RegisteredUser("113", "Maria", "Ramirez", "1234567890123457", "Goodbye world", UserType.BOTH);
		System.out.println("The created RegisteredUser is: " + user2 +".");
		System.out.println("We answer the comment with this new user and the text 'Respuesta a comentario de prueba'.");
		tComment.answerComment("Respuesta a comentario de prueba", user2);
		System.out.println("The TextComment is now: " + tComment + ".");
	}

}

