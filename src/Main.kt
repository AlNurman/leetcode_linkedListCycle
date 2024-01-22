class ListNode(var `val`: Int){
	var next: ListNode?=null
}
fun hasCycle(head: ListNode?): Boolean {
	var curr = head
	var counter=0
	while (curr?.next!=null){
		curr=curr.next
		counter++
		if (counter>10000)return true
	}
	return false
}
fun main() {
	println("Hello World!")

}