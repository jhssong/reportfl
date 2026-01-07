{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/functors/NOPTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NOPTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Transformer\u003cT, T\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 71,
      "comment": "\n * Transformer implementation that does nothing.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serial version UID "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 35,
      "end_line": 36,
      "comment": " Singleton predicate instance "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.NOPTransformer.nopTransformer()",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     * Factory returning the singleton instance.\n     *\n     * @param \u003cT\u003e  the input/output type\n     * @return the singleton instance\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.NOPTransformer.NOPTransformer()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Constructor.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.NOPTransformer.transform(T)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Transforms the input to result by doing nothing.\n     *\n     * @param input  the input object to transform\n     * @return the transformed result which is the input\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.NOPTransformer.readResolve()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 24)"
      ]
    }
  ]
}