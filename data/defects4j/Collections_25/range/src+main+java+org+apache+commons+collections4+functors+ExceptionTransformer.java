{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/functors/ExceptionTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExceptionTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Transformer\u003cI, O\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 74,
      "comment": "\n * Transformer implementation that always throws an exception.\n *\n * @since 3.0\n * @version $Id$\n "
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
        "INSTANCE"
      ],
      "begin_line": 36,
      "end_line": 37,
      "comment": " Singleton predicate instance "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ExceptionTransformer.exceptionTransformer()",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n     * Factory returning the singleton instance.\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @return the singleton instance\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.ExceptionTransformer.ExceptionTransformer()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Restricted constructor.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ExceptionTransformer.transform(I)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Transforms the input to result by cloning it.\n     *\n     * @param input  the input object to transform\n     * @return never\n     * @throws FunctorException always\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ExceptionTransformer.readResolve()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 24)"
      ]
    }
  ]
}