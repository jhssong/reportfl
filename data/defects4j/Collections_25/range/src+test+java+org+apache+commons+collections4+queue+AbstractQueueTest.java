{
  "filepath": "/tmp/Collections-25b/src/test/java/org/apache/commons/collections4/queue/AbstractQueueTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractQueueTest",
      "is_interface": false,
      "parent_types": [
        "AbstractCollectionTest\u003cE\u003e"
      ],
      "begin_line": 44,
      "end_line": 384,
      "comment": "\n * Abstract test class for {@link java.util.Queue} methods and contracts.\n * \u003cp\u003e\n * To use, simply extend this class, and implement\n * the {@link #makeObject} method.\n * \u003cp\u003e\n * If your {@link Queue} fails one of these tests by design,\n * you may still use this base set of cases.  Simply override the\n * test case (method) your {@link Queue} fails or override one of the\n * protected methods from AbstractCollectionTest.\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.queue.AbstractQueueTest.AbstractQueueTest(java.lang.String)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * JUnit constructor.\n     *\n     * @param testName  the test class name\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.AbstractQueueTest.isSetSupported()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     *  Returns true if the collections produced by\n     *  {@link #makeObject()} and {@link #makeFullCollection()}\n     *  support the \u003ccode\u003eset operation.\u003cp\u003e\n     *  Default implementation returns true.  Override if your collection\n     *  class does not support set.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.AbstractQueueTest.verify()",
      "begin_line": 72,
      "end_line": 82,
      "comment": "\n     *  Verifies that the test queue implementation matches the confirmed queue\n     *  implementation.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 23)",
        "(line 75,col 9)-(line 75,col 65)",
        "(line 76,col 9)-(line 81,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.AbstractQueueTest.makeConfirmedCollection()",
      "begin_line": 88,
      "end_line": 92,
      "comment": "\n     * Returns an empty {@link ArrayList}.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 53)",
        "(line 91,col 9)-(line 91,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.AbstractQueueTest.makeConfirmedFullCollection()",
      "begin_line": 97,
      "end_line": 102,
      "comment": "\n     * Returns a full {@link ArrayList}.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 53)",
        "(line 100,col 9)-(line 100,col 54)",
        "(line 101,col 9)-(line 101,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.AbstractQueueTest.makeObject()",
      "begin_line": 109,
      "end_line": 110,
      "comment": "\n     * Returns {@link #makeObject()}.\n     *\n     * @return an empty queue to be used for testing\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.AbstractQueueTest.makeFullCollection()",
      "begin_line": 115,
      "end_line": 121,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 44)",
        "(line 119,col 9)-(line 119,col 55)",
        "(line 120,col 9)-(line 120,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.AbstractQueueTest.getCollection()",
      "begin_line": 129,
      "end_line": 132,
      "comment": "\n     * Returns the {@link #collection} field cast to a {@link Queue}.\n     *\n     * @return the collection field as a Queue\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.AbstractQueueTest.testQueueOffer()",
      "begin_line": 138,
      "end_line": 165,
      "comment": "\n     *  Tests {@link Queue#offer(Object)}.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)",
        "(line 143,col 9)-(line 143,col 47)",
        "(line 144,col 9)-(line 151,col 9)",
        "(line 153,col 9)-(line 153,col 21)",
        "(line 154,col 9)-(line 154,col 21)",
        "(line 155,col 9)-(line 164,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.AbstractQueueTest.testQueueElement()",
      "begin_line": 170,
      "end_line": 210,
      "comment": "\n     *  Tests {@link Queue#element()}.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 21)",
        "(line 173,col 9)-(line 178,col 9)",
        "(line 180,col 9)-(line 180,col 20)",
        "(line 182,col 9)-(line 182,col 71)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 188,col 49)",
        "(line 189,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 209,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.AbstractQueueTest.testQueuePeek()",
      "begin_line": 215,
      "end_line": 245,
      "comment": "\n     *  Tests {@link Queue#peek()}.\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 218,col 9)",
        "(line 220,col 9)-(line 220,col 21)",
        "(line 222,col 9)-(line 222,col 43)",
        "(line 223,col 9)-(line 223,col 28)",
        "(line 225,col 9)-(line 225,col 20)",
        "(line 227,col 9)-(line 227,col 49)",
        "(line 228,col 9)-(line 241,col 9)",
        "(line 243,col 9)-(line 243,col 41)",
        "(line 244,col 9)-(line 244,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.AbstractQueueTest.testQueueRemove()",
      "begin_line": 250,
      "end_line": 280,
      "comment": "\n     *  Tests {@link Queue#remove()}.\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 253,col 9)",
        "(line 255,col 9)-(line 255,col 21)",
        "(line 257,col 9)-(line 262,col 9)",
        "(line 264,col 9)-(line 264,col 20)",
        "(line 266,col 9)-(line 266,col 49)",
        "(line 267,col 9)-(line 272,col 9)",
        "(line 274,col 9)-(line 279,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.AbstractQueueTest.testQueuePoll()",
      "begin_line": 285,
      "end_line": 307,
      "comment": "\n     *  Tests {@link Queue#poll()}.\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 288,col 9)",
        "(line 290,col 9)-(line 290,col 21)",
        "(line 292,col 9)-(line 292,col 43)",
        "(line 293,col 9)-(line 293,col 28)",
        "(line 295,col 9)-(line 295,col 20)",
        "(line 297,col 9)-(line 297,col 49)",
        "(line 298,col 9)-(line 303,col 9)",
        "(line 305,col 9)-(line 305,col 41)",
        "(line 306,col 9)-(line 306,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.AbstractQueueTest.testEmptyQueueSerialization()",
      "begin_line": 310,
      "end_line": 322,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 44)",
        "(line 313,col 9)-(line 315,col 9)",
        "(line 317,col 9)-(line 317,col 77)",
        "(line 318,col 9)-(line 318,col 77)",
        "(line 320,col 9)-(line 320,col 63)",
        "(line 321,col 9)-(line 321,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.AbstractQueueTest.testFullQueueSerialization()",
      "begin_line": 324,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 52)",
        "(line 327,col 9)-(line 327,col 50)",
        "(line 328,col 9)-(line 330,col 9)",
        "(line 332,col 9)-(line 332,col 77)",
        "(line 333,col 9)-(line 333,col 77)",
        "(line 335,col 9)-(line 335,col 70)",
        "(line 336,col 9)-(line 336,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.AbstractQueueTest.testEmptyQueueCompatibility()",
      "begin_line": 343,
      "end_line": 360,
      "comment": "\n     * Compare the current serialized form of the Queue\n     * against the canonical version in SVN.\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 44)",
        "(line 355,col 9)-(line 359,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.AbstractQueueTest.testFullQueueCompatibility()",
      "begin_line": 366,
      "end_line": 382,
      "comment": "\n     * Compare the current serialized form of the Queue\n     * against the canonical version in SVN.\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 52)",
        "(line 378,col 9)-(line 381,col 9)"
      ]
    }
  ]
}