{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/functors/PrototypeFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PrototypeFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 205,
      "comment": "\n * Factory implementation that creates a new instance each time based on a prototype.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.PrototypeFactory.prototypeFactory(T)",
      "begin_line": 57,
      "end_line": 80,
      "comment": "\n     * Factory method that performs validation.\n     * \u003cp\u003e\n     * Creates a Factory that will return a clone of the same prototype object\n     * each time the factory is used. The prototype will be cloned using one of these\n     * techniques (in order):\n     * \u003cul\u003e\n     * \u003cli\u003epublic clone method\n     * \u003cli\u003epublic copy constructor\n     * \u003cli\u003eserialization clone\n     * \u003cul\u003e\n     *\n     * @param \u003cT\u003e  the type the factory creates\n     * @param prototype  the object to clone each time in the factory\n     * @return the \u003ccode\u003eprototype\u003c/code\u003e factory, or a {@link ConstantFactory#NULL_INSTANCE} if\n     * the {@code prototype} is {@code null}\n     * @throws IllegalArgumentException if the prototype cannot be cloned\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 104)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.PrototypeFactory.PrototypeFactory()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Restricted constructor.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 16)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PrototypeCloneFactory",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Factory\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 94,
      "end_line": 144,
      "comment": "\n     * PrototypeCloneFactory creates objects by copying a prototype using the clone method.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " The serial version "
    },
    {
      "type": "field",
      "varNames": [
        "iPrototype"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " The object to clone each time "
    },
    {
      "type": "field",
      "varNames": [
        "iCloneMethod"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " The method used to clone "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.PrototypeFactory.PrototypeCloneFactory.PrototypeCloneFactory(T, java.lang.reflect.Method)",
      "begin_line": 107,
      "end_line": 111,
      "comment": "\n         * Constructor to store prototype.\n         ",
      "child_ranges": [
        "(line 108,col 13)-(line 108,col 20)",
        "(line 109,col 13)-(line 109,col 35)",
        "(line 110,col 13)-(line 110,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.PrototypeFactory.PrototypeCloneFactory.findCloneMethod()",
      "begin_line": 116,
      "end_line": 122,
      "comment": "\n         * Find the Clone method for the class specified.\n         ",
      "child_ranges": [
        "(line 117,col 13)-(line 121,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.PrototypeFactory.PrototypeCloneFactory.create()",
      "begin_line": 129,
      "end_line": 143,
      "comment": "\n         * Creates an object by calling the clone method.\n         *\n         * @return the new object\n         ",
      "child_ranges": [
        "(line 132,col 13)-(line 134,col 13)",
        "(line 136,col 13)-(line 142,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PrototypeSerializationFactory",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Factory\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 151,
      "end_line": 203,
      "comment": "\n     * PrototypeSerializationFactory creates objects by cloning a prototype using serialization.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " The serial version "
    },
    {
      "type": "field",
      "varNames": [
        "iPrototype"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": " The object to clone via serialization each time "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.PrototypeFactory.PrototypeSerializationFactory.PrototypeSerializationFactory(T)",
      "begin_line": 162,
      "end_line": 165,
      "comment": "\n         * Constructor to store prototype\n         ",
      "child_ranges": [
        "(line 163,col 13)-(line 163,col 20)",
        "(line 164,col 13)-(line 164,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.PrototypeFactory.PrototypeSerializationFactory.create()",
      "begin_line": 172,
      "end_line": 202,
      "comment": "\n         * Creates an object using serialization.\n         *\n         * @return the new object\n         ",
      "child_ranges": [
        "(line 174,col 13)-(line 174,col 78)",
        "(line 175,col 13)-(line 175,col 45)",
        "(line 176,col 13)-(line 201,col 13)"
      ]
    }
  ]
}