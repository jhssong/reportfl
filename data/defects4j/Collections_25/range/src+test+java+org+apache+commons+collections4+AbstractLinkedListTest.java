{
  "filepath": "/tmp/Collections-25b/src/test/java/org/apache/commons/collections4/AbstractLinkedListTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLinkedListTest",
      "is_interface": false,
      "parent_types": [
        "AbstractListTest\u003cT\u003e"
      ],
      "begin_line": 39,
      "end_line": 222,
      "comment": "\n * Tests base {@link java.util.LinkedList} methods and contracts.\n * \u003cp\u003e\n * To use, simply extend this class, and implement\n * the {@link #makeObject()} method.\n * \u003cp\u003e\n * If your {@link LinkedList} fails one of these tests by design,\n * you may still use this base set of cases.  Simply override the\n * test case (method) your {@link List} fails.\n *\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.AbstractLinkedListTest.AbstractLinkedListTest(java.lang.String)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractLinkedListTest.makeObject()",
      "begin_line": 45,
      "end_line": 46,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractLinkedListTest.getCollection()",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     *  Returns the {@link #collection} field cast to a {@link LinkedList}.\n     *\n     *  @return the collection field as a List\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractLinkedListTest.getConfirmedLinkedList()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     *  Returns the {@link #confirmed} field cast to a {@link LinkedList}.\n     *\n     *  @return the confirmed field as a List\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractLinkedListTest.testLinkedListAddFirst()",
      "begin_line": 70,
      "end_line": 86,
      "comment": "\n     *  Tests {@link LinkedList#addFirst(Object)}.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 32)",
        "(line 77,col 9)-(line 77,col 21)",
        "(line 78,col 9)-(line 78,col 36)",
        "(line 79,col 9)-(line 79,col 45)",
        "(line 80,col 9)-(line 80,col 17)",
        "(line 82,col 9)-(line 82,col 20)",
        "(line 83,col 9)-(line 83,col 36)",
        "(line 84,col 9)-(line 84,col 45)",
        "(line 85,col 9)-(line 85,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractLinkedListTest.testLinkedListAddLast()",
      "begin_line": 91,
      "end_line": 107,
      "comment": "\n     *  Tests {@link LinkedList#addLast(Object)}.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 32)",
        "(line 98,col 9)-(line 98,col 21)",
        "(line 99,col 9)-(line 99,col 35)",
        "(line 100,col 9)-(line 100,col 44)",
        "(line 101,col 9)-(line 101,col 17)",
        "(line 103,col 9)-(line 103,col 20)",
        "(line 104,col 9)-(line 104,col 35)",
        "(line 105,col 9)-(line 105,col 44)",
        "(line 106,col 9)-(line 106,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractLinkedListTest.testLinkedListGetFirst()",
      "begin_line": 112,
      "end_line": 129,
      "comment": "\n     *  Tests {@link LinkedList#getFirst()}.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 21)",
        "(line 114,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 17)",
        "(line 123,col 9)-(line 123,col 20)",
        "(line 124,col 9)-(line 124,col 56)",
        "(line 125,col 9)-(line 125,col 74)",
        "(line 126,col 9)-(line 127,col 39)",
        "(line 128,col 9)-(line 128,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractLinkedListTest.testLinkedListGetLast()",
      "begin_line": 134,
      "end_line": 151,
      "comment": "\n     *  Tests {@link LinkedList#getLast()}.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 21)",
        "(line 136,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 17)",
        "(line 145,col 9)-(line 145,col 20)",
        "(line 146,col 9)-(line 146,col 54)",
        "(line 147,col 9)-(line 147,col 72)",
        "(line 148,col 9)-(line 149,col 37)",
        "(line 150,col 9)-(line 150,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractLinkedListTest.testLinkedListRemoveFirst()",
      "begin_line": 156,
      "end_line": 177,
      "comment": "\n     *  Tests {@link LinkedList#removeFirst()}.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)",
        "(line 161,col 9)-(line 161,col 21)",
        "(line 162,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 17)",
        "(line 171,col 9)-(line 171,col 20)",
        "(line 172,col 9)-(line 172,col 59)",
        "(line 173,col 9)-(line 173,col 77)",
        "(line 174,col 9)-(line 175,col 39)",
        "(line 176,col 9)-(line 176,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractLinkedListTest.testLinkedListRemoveLast()",
      "begin_line": 182,
      "end_line": 203,
      "comment": "\n     *  Tests {@link LinkedList#removeLast()}.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 185,col 9)",
        "(line 187,col 9)-(line 187,col 21)",
        "(line 188,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 17)",
        "(line 197,col 9)-(line 197,col 20)",
        "(line 198,col 9)-(line 198,col 57)",
        "(line 199,col 9)-(line 199,col 75)",
        "(line 200,col 9)-(line 201,col 37)",
        "(line 202,col 9)-(line 202,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractLinkedListTest.makeConfirmedCollection()",
      "begin_line": 208,
      "end_line": 211,
      "comment": "\n     *  Returns an empty {@link LinkedList}.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractLinkedListTest.makeConfirmedFullCollection()",
      "begin_line": 216,
      "end_line": 221,
      "comment": "\n     *  Returns a full {@link LinkedList}.\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 49)",
        "(line 219,col 9)-(line 219,col 54)",
        "(line 220,col 9)-(line 220,col 20)"
      ]
    }
  ]
}