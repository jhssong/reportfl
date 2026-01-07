{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/functors/PrototypeFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PrototypeFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 207,
      "comment": "\n * Factory implementation that creates a new instance each time based on a prototype.\n * \u003cp\u003e\n * \u003cb\u003eWARNING:\u003c/b\u003e from v4.1 onwards {@link Factory} instances returned by\n * {@link #prototypeFactory(Object)} will \u003cb\u003enot\u003c/b\u003e be serializable anymore in order\n * to prevent potential remote code execution exploits. Please refer to\n * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COLLECTIONS-580\"\u003eCOLLECTIONS-580\u003c/a\u003e\n * for more details.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.PrototypeFactory.prototypeFactory(T)",
      "begin_line": 63,
      "end_line": 86,
      "comment": "\n     * Factory method that performs validation.\n     * \u003cp\u003e\n     * Creates a Factory that will return a clone of the same prototype object\n     * each time the factory is used. The prototype will be cloned using one of these\n     * techniques (in order):\n     * \u003cul\u003e\n     * \u003cli\u003epublic clone method\n     * \u003cli\u003epublic copy constructor\n     * \u003cli\u003eserialization clone\n     * \u003cul\u003e\n     *\n     * @param \u003cT\u003e  the type the factory creates\n     * @param prototype  the object to clone each time in the factory\n     * @return the \u003ccode\u003eprototype\u003c/code\u003e factory, or a {@link ConstantFactory#NULL_INSTANCE} if\n     * the {@code prototype} is {@code null}\n     * @throws IllegalArgumentException if the prototype cannot be cloned\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 104)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.PrototypeFactory.PrototypeFactory()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Restricted constructor.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 16)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PrototypeCloneFactory",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Factory\u003cT\u003e"
      ],
      "begin_line": 100,
      "end_line": 148,
      "comment": "\n     * PrototypeCloneFactory creates objects by copying a prototype using the clone method.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iPrototype"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " The object to clone each time "
    },
    {
      "type": "field",
      "varNames": [
        "iCloneMethod"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " The method used to clone "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.PrototypeFactory.PrototypeCloneFactory.PrototypeCloneFactory(T, java.lang.reflect.Method)",
      "begin_line": 110,
      "end_line": 114,
      "comment": "\n         * Constructor to store prototype.\n         ",
      "child_ranges": [
        "(line 111,col 13)-(line 111,col 20)",
        "(line 112,col 13)-(line 112,col 35)",
        "(line 113,col 13)-(line 113,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.PrototypeFactory.PrototypeCloneFactory.findCloneMethod()",
      "begin_line": 119,
      "end_line": 125,
      "comment": "\n         * Find the Clone method for the class specified.\n         ",
      "child_ranges": [
        "(line 120,col 13)-(line 124,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.PrototypeFactory.PrototypeCloneFactory.create()",
      "begin_line": 132,
      "end_line": 147,
      "comment": "\n         * Creates an object by calling the clone method.\n         *\n         * @return the new object\n         ",
      "child_ranges": [
        "(line 136,col 13)-(line 138,col 13)",
        "(line 140,col 13)-(line 146,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PrototypeSerializationFactory",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Factory\u003cT\u003e"
      ],
      "begin_line": 155,
      "end_line": 205,
      "comment": "\n     * PrototypeSerializationFactory creates objects by cloning a prototype using serialization.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iPrototype"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": " The object to clone via serialization each time "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.PrototypeFactory.PrototypeSerializationFactory.PrototypeSerializationFactory(T)",
      "begin_line": 163,
      "end_line": 166,
      "comment": "\n         * Constructor to store prototype\n         ",
      "child_ranges": [
        "(line 164,col 13)-(line 164,col 20)",
        "(line 165,col 13)-(line 165,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.PrototypeFactory.PrototypeSerializationFactory.create()",
      "begin_line": 173,
      "end_line": 204,
      "comment": "\n         * Creates an object using serialization.\n         *\n         * @return the new object\n         ",
      "child_ranges": [
        "(line 176,col 13)-(line 176,col 78)",
        "(line 177,col 13)-(line 177,col 45)",
        "(line 178,col 13)-(line 203,col 13)"
      ]
    }
  ]
}