{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/functors/ConstantFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConstantFactory",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Factory\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 90,
      "comment": "\n * Factory implementation that returns the same constant each time.\n * \u003cp\u003e\n * No check is made that the object is immutable. In general, only immutable\n * objects should use the constant factory. Mutable objects should\n * use the prototype factory.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Serial version UID "
    },
    {
      "type": "field",
      "varNames": [
        "NULL_INSTANCE"
      ],
      "begin_line": 39,
      "end_line": 40,
      "comment": " Returns null each time "
    },
    {
      "type": "field",
      "varNames": [
        "iConstant"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The closures to call in turn "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ConstantFactory.constantFactory(T)",
      "begin_line": 52,
      "end_line": 58,
      "comment": "\n     * Factory method that performs validation.\n     *\n     * @param \u003cT\u003e  the type of the constant\n     * @param constantToReturn  the constant object to return each time in the factory\n     * @return the \u003ccode\u003econstant\u003c/code\u003e factory.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 57,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.ConstantFactory.ConstantFactory(T)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003econstantFactory\u003c/code\u003e if you want that.\n     *\n     * @param constantToReturn  the constant to return each time\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 16)",
        "(line 68,col 9)-(line 68,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ConstantFactory.create()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Always return constant.\n     *\n     * @return the stored constant value\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ConstantFactory.getConstant()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Gets the constant.\n     *\n     * @return the constant\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 25)"
      ]
    }
  ]
}