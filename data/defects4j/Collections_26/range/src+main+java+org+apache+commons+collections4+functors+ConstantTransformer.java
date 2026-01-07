{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/functors/ConstantTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConstantTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Transformer\u003cI, O\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 129,
      "comment": "\n * Transformer implementation that returns the same constant each time.\n * \u003cp\u003e\n * No check is made that the object is immutable. In general, only immutable\n * objects should use the constant factory. Mutable objects should\n * use the prototype factory.\n *\n * @since 3.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.collections4.functors.ConstantTransformer.nullTransformer()",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Get a typed null instance.\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @return Transformer\u003cI, O\u003e that always returns null.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ConstantTransformer.constantTransformer(O)",
      "begin_line": 65,
      "end_line": 70,
      "comment": "\n     * Transformer method that performs validation.\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @param constantToReturn  the constant object to return each time in the factory\n     * @return the \u003ccode\u003econstant\u003c/code\u003e factory.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 69,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.ConstantTransformer.ConstantTransformer(O)",
      "begin_line": 78,
      "end_line": 81,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003econstantTransformer\u003c/code\u003e if you want that.\n     *\n     * @param constantToReturn  the constant to return each time\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 16)",
        "(line 80,col 9)-(line 80,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ConstantTransformer.transform(I)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Transforms the input by ignoring it and returning the stored constant instead.\n     *\n     * @param input  the input object which is ignored\n     * @return the stored constant\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ConstantTransformer.getConstant()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Gets the constant.\n     *\n     * @return the constant\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ConstantTransformer.equals(java.lang.Object)",
      "begin_line": 106,
      "end_line": 116,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 85)",
        "(line 115,col 9)-(line 115,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ConstantTransformer.hashCode()",
      "begin_line": 121,
      "end_line": 128,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 59)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 22)"
      ]
    }
  ]
}