{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/ArrayStack.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayStack",
      "is_interface": false,
      "parent_types": [
        "java.util.ArrayList\u003cE\u003e"
      ],
      "begin_line": 44,
      "end_line": 167,
      "comment": "\n * An implementation of the {@link java.util.Stack} API that is based on an\n * \u003ccode\u003eArrayList\u003c/code\u003e instead of a \u003ccode\u003eVector\u003c/code\u003e, so it is not\n * synchronized to protect against multi-threaded access.  The implementation\n * is therefore operates faster in environments where you do not need to\n * worry about multiple thread contention.\n * \u003cp\u003e\n * The removal order of an \u003ccode\u003eArrayStack\u003c/code\u003e is based on insertion\n * order: The most recently added element is removed first.  The iteration\n * order is \u003ci\u003enot\u003c/i\u003e the same as the removal order.  The iterator returns\n * elements from the bottom up.\n * \u003cp\u003e\n * Unlike \u003ccode\u003eStack\u003c/code\u003e, \u003ccode\u003eArrayStack\u003c/code\u003e accepts null entries.\n * \u003cp\u003e\n * \u003cb\u003eNote:\u003c/b\u003e From version 4.0 onwards, this class does not implement the\n * removed {@code Buffer} interface anymore.\n *\n * @see java.util.Stack\n * @since 1.0\n * @version $Id$\n * @deprecated use {@link java.util.ArrayDeque} instead (available from Java 1.6)\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Ensure serialization compatibility "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.ArrayStack.ArrayStack()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Constructs a new empty \u003ccode\u003eArrayStack\u003c/code\u003e. The initial size\n     * is controlled by \u003ccode\u003eArrayList\u003c/code\u003e and is currently 10.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.ArrayStack.ArrayStack(int)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Constructs a new empty \u003ccode\u003eArrayStack\u003c/code\u003e with an initial size.\n     *\n     * @param initialSize  the initial size to use\n     * @throws IllegalArgumentException  if the specified initial size\n     *  is negative\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ArrayStack.empty()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Return \u003ccode\u003etrue\u003c/code\u003e if this stack is currently empty.\n     * \u003cp\u003e\n     * This method exists for compatibility with \u003ccode\u003ejava.util.Stack\u003c/code\u003e.\n     * New users of this class should use \u003ccode\u003eisEmpty\u003c/code\u003e instead.\n     *\n     * @return true if the stack is currently empty\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ArrayStack.peek()",
      "begin_line": 87,
      "end_line": 94,
      "comment": "\n     * Returns the top item off of this stack without removing it.\n     *\n     * @return the top item on the stack\n     * @throws EmptyStackException  if the stack is empty\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 29)",
        "(line 89,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ArrayStack.peek(int)",
      "begin_line": 105,
      "end_line": 112,
      "comment": "\n     * Returns the n\u0027th item down (zero-relative) from the top of this\n     * stack without removing it.\n     *\n     * @param n  the number of items down to go\n     * @return the n\u0027th item on the stack, zero relative\n     * @throws EmptyStackException  if there are not enough items on the\n     *  stack to satisfy this request\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 39)",
        "(line 107,col 9)-(line 111,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ArrayStack.pop()",
      "begin_line": 120,
      "end_line": 127,
      "comment": "\n     * Pops the top item off of this stack and return it.\n     *\n     * @return the top item on the stack\n     * @throws EmptyStackException  if the stack is empty\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 29)",
        "(line 122,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ArrayStack.push(E)",
      "begin_line": 136,
      "end_line": 139,
      "comment": "\n     * Pushes a new item onto the top of this stack. The pushed item is also\n     * returned. This is equivalent to calling \u003ccode\u003eadd\u003c/code\u003e.\n     *\n     * @param item  the item to be added\n     * @return the item just pushed\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 18)",
        "(line 138,col 9)-(line 138,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ArrayStack.search(java.lang.Object)",
      "begin_line": 152,
      "end_line": 165,
      "comment": "\n     * Returns the one-based position of the distance from the top that the\n     * specified object exists on this stack, where the top-most element is\n     * considered to be at distance \u003ccode\u003e1\u003c/code\u003e.  If the object is not\n     * present on the stack, return \u003ccode\u003e-1\u003c/code\u003e instead.  The\n     * \u003ccode\u003eequals()\u003c/code\u003e method is used to compare to the items\n     * in this stack.\n     *\n     * @param object  the object to be searched for\n     * @return the 1-based depth into the stack of the object, or -1 if not found\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 27)",
        "(line 154,col 9)-(line 154,col 18)",
        "(line 155,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 18)"
      ]
    }
  ]
}