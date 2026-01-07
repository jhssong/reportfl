{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/functors/FactoryTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FactoryTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Transformer\u003cI, O\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 86,
      "comment": "\n * Transformer implementation that calls a Factory and returns the result.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serial version UID "
    },
    {
      "type": "field",
      "varNames": [
        "iFactory"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " The factory to wrap "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.FactoryTransformer.factoryTransformer(org.apache.commons.collections4.Factory\u003c? extends O\u003e)",
      "begin_line": 47,
      "end_line": 52,
      "comment": "\n     * Factory method that performs validation.\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @param factory  the factory to call, not null\n     * @return the \u003ccode\u003efactory\u003c/code\u003e transformer\n     * @throws NullPointerException if the factory is null\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 50,col 9)",
        "(line 51,col 9)-(line 51,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.FactoryTransformer.FactoryTransformer(org.apache.commons.collections4.Factory\u003c? extends O\u003e)",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003efactoryTransformer\u003c/code\u003e if you want that.\n     *\n     * @param factory  the factory to call, not null\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 16)",
        "(line 62,col 9)-(line 62,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.FactoryTransformer.transform(I)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Transforms the input by ignoring the input and returning the result of\n     * calling the decorated factory.\n     *\n     * @param input  the input object to transform\n     * @return the transformed result\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.FactoryTransformer.getFactory()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Gets the factory.\n     *\n     * @return the factory\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 24)"
      ]
    }
  ]
}