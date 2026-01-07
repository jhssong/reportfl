{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/functors/StringValueTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringValueTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Transformer\u003cT, java.lang.String\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 72,
      "comment": "\n * Transformer implementation that returns the result of calling\n * \u003ccode\u003eString.valueOf\u003c/code\u003e on the input object.\n *\n * @since 3.0\n * @version $Id$\n "
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
      "end_line": 36,
      "comment": " Singleton predicate instance "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.StringValueTransformer.stringValueTransformer()",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     * Factory returning the singleton instance.\n     *\n     * @param \u003cT\u003e  the input type\n     * @return the singleton instance\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.StringValueTransformer.StringValueTransformer()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Restricted constructor.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.StringValueTransformer.transform(T)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     * Transforms the input to result by calling \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param input  the input object to transform\n     * @return the transformed result\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.StringValueTransformer.readResolve()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 24)"
      ]
    }
  ]
}