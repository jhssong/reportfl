{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/functors/CloneTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CloneTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Transformer\u003cT, T\u003e"
      ],
      "begin_line": 34,
      "end_line": 73,
      "comment": "\n * Transformer implementation that returns a clone of the input object.\n * \u003cp\u003e\n * Clone is performed using \u003ccode\u003ePrototypeFactory.prototypeFactory(input).create()\u003c/code\u003e.\n * \u003cp\u003e\n * \u003cb\u003eWARNING:\u003c/b\u003e from v4.1 onwards this class will \u003cb\u003enot\u003c/b\u003e be serializable anymore\n * in order to prevent potential remote code execution exploits. Please refer to\n * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COLLECTIONS-580\"\u003eCOLLECTIONS-580\u003c/a\u003e\n * for more details.\n *\n * @since 3.0\n * @version $Id$\n "
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
        "(line 49,col 9)-(line 49,col 24)"
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
      "end_line": 71,
      "comment": "\n     * Transforms the input to result by cloning it.\n     *\n     * @param input  the input object to transform\n     * @return the transformed result\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 65)"
      ]
    }
  ]
}