{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/functors/CloneTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CloneTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Transformer\u003cT, T\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 76,
      "comment": "\n * Transformer implementation that returns a clone of the input object.\n * \u003cp\u003e\n * Clone is performed using \u003ccode\u003ePrototypeFactory.prototypeFactory(input).create()\u003c/code\u003e.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serial version UID "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 37,
      "end_line": 38,
      "comment": " Singleton predicate instance "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.CloneTransformer.cloneTransformer()",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n     * Factory returning the singleton instance.\n     *\n     * @param \u003cT\u003e  the type of the objects to be cloned\n     * @return the singleton instance\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.CloneTransformer.CloneTransformer()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Constructor.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.CloneTransformer.transform(T)",
      "begin_line": 65,
      "end_line": 70,
      "comment": "\n     * Transforms the input to result by cloning it.\n     *\n     * @param input  the input object to transform\n     * @return the transformed result\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 69,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.CloneTransformer.readResolve()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 24)"
      ]
    }
  ]
}