{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/NullArgumentException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NullArgumentException",
      "is_interface": false,
      "parent_types": [
        "java.lang.IllegalArgumentException"
      ],
      "begin_line": 46,
      "end_line": 64,
      "comment": "\n * \u003cp\u003eThrown to indicate that an argument was \u003ccode\u003enull\u003c/code\u003e and should\n * not have been.\n * This exception supplements the standard \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n * by providing a more semantically rich description of the problem.\u003c/p\u003e\n * \n * \u003cp\u003e\u003ccode\u003eNullArgumentException\u003c/code\u003e represents the case where a method takes\n * in a parameter that must not be \u003ccode\u003enull\u003c/code\u003e.\n * Some coding standards would use \u003ccode\u003eNullPointerException\u003c/code\u003e for this case,\n * others will use \u003ccode\u003eIllegalArgumentException\u003c/code\u003e.\n * Thus this exception would be used in place of\n * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e, yet it still extends it.\u003c/p\u003e\n * \n * \u003cpre\u003e\n * public void foo(String str) {\n *   if (str \u003d\u003d null) {\n *     throw new NullArgumentException(\"str\");\n *   }\n *   // do something with the string\n * }\n * \u003c/pre\u003e\n * \n * @author Matthew Hawthorne\n * @author Stephen Colebourne\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.NullArgumentException.NullArgumentException(java.lang.String)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * \u003cp\u003eInstantiates with the given argument name.\u003c/p\u003e\n     *\n     * @param argName  the name of the argument that was \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 79)"
      ]
    }
  ]
}