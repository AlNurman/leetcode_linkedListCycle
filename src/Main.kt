class ListNode(var `val`: Int){
	var next: ListNode?=null
}
fun hasCycle(head: ListNode?): Boolean {
	fun hasCycle(head: ListNode?): Boolean {
		var curr = head
		var counter=0
		var sum=0
		var sum_max=-1000000
		var sum_qty=0
		while (curr?.next!=null){
			sum+=curr.`val`
			curr=curr.next
			if (sum_max==sum)sum_qty++
			if (sum_max<sum)sum_max=sum

			if (sum_qty>2) return true
			counter++

			if (counter>10000)return true
		}
		return false
	}
fun main() {
	println("Hello World!")

}