{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/IncompleteArgumentException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IncompleteArgumentException",
      "is_interface": false,
      "parent_types": [
        "java.lang.IllegalArgumentException"
      ],
      "begin_line": 47,
      "end_line": 84,
      "comment": "\n * \u003cp\u003eThrown to indicate an incomplete argument to a method.\n * This exception supplements the standard \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n * by providing a more semantically rich description of the problem.\u003c/p\u003e\n * \n * \u003cp\u003e\u003ccode\u003eIncompleteArgumentException\u003c/code\u003e represents the case where a method takes\n * in a parameter that has a number of properties, some of which have not been set.\n * A case might be a search requirements bean that must have three properties set\n * in order for the method to run, but only one is actually set.\n * This exception would be used in place of\n * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e, yet it still extends it.\u003c/p\u003e\n * \n * \u003cpre\u003e\n * public void foo(PersonSearcher search) {\n *   if (search.getSurname() \u003d\u003d null ||\n *       search.getForename() \u003d\u003d null ||\n *       search.getSex() \u003d\u003d null) {\n *     throw new IncompleteArgumentException(\"search\");\n *   }\n *   // do something with the searcher\n * }\n * \u003c/pre\u003e\n * \n * @author Matthew Hawthorne\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Serialization version. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.IncompleteArgumentException.IncompleteArgumentException(java.lang.String)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * \u003cp\u003eInstantiates with the specified description.\u003c/p\u003e\n     * \n     * @param argName  a description of the incomplete argument\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.IncompleteArgumentException.IncompleteArgumentException(java.lang.String, java.lang.String[])",
      "begin_line": 67,
      "end_line": 72,
      "comment": "\n     * \u003cp\u003eInstantiates with the specified description.\u003c/p\u003e\n     * \n     * @param argName  a description of the incomplete argument\n     * @param items  an array describing the arguments missing\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 71,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.IncompleteArgumentException.safeArrayToString(java.lang.Object[])",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * \u003cp\u003eConverts an array to a string without throwing an exception.\u003c/p\u003e\n     * \n     * @param array  an array\n     * @return the array as a string\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 70)"
      ]
    }
  ]
}