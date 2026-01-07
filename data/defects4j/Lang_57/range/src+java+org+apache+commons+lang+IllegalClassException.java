{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/IllegalClassException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IllegalClassException",
      "is_interface": false,
      "parent_types": [
        "java.lang.IllegalArgumentException"
      ],
      "begin_line": 45,
      "end_line": 103,
      "comment": "\n * \u003cp\u003eThrown when an object is an instance of an unexpected type (a class or interface).\n * This exception supplements the standard \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n * by providing a more semantically rich description of the problem.\u003c/p\u003e\n * \n * \u003cp\u003e\u003ccode\u003eIllegalClassException\u003c/code\u003e represents the case where a method takes\n * in a genericly typed parameter like Object (typically because it has to due to some\n * other interface it implements), but this implementation only actually accepts a specific\n * type, for example String. This exception would be used in place of\n * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e, yet it still extends it.\u003c/p\u003e\n * \n * \u003cpre\u003e\n * public void foo(Object obj) {\n *   if (obj instanceof String \u003d\u003d false) {\n *     throw new IllegalClassException(String.class, obj);\n *   }\n *   // do something with the string\n * }\n * \u003c/pre\u003e\n * \n * @author Matthew Hawthorne\n * @author Gary Gregory\n * @author Stephen Colebourne\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.IllegalClassException.IllegalClassException(java.lang.Class, java.lang.Object)",
      "begin_line": 61,
      "end_line": 67,
      "comment": "\n     * \u003cp\u003eInstantiates with the expected type, and actual object.\u003c/p\u003e\n     * \n     * @param expected  the expected type\n     * @param actual  the actual object\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 66,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.IllegalClassException.IllegalClassException(java.lang.Class, java.lang.Class)",
      "begin_line": 75,
      "end_line": 81,
      "comment": "\n     * \u003cp\u003eInstantiates with the expected and actual types.\u003c/p\u003e\n     * \n     * @param expected  the expected type\n     * @param actual  the actual type\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 80,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.IllegalClassException.IllegalClassException(java.lang.String)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * \u003cp\u003eInstantiates with the specified message.\u003c/p\u003e\n     * \n     * @param message  the exception message\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.IllegalClassException.safeGetClassName(java.lang.Class)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * \u003cp\u003eReturns the class name or \u003ccode\u003enull\u003c/code\u003e if the class is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param cls  a \u003ccode\u003eClass\u003c/code\u003e\n     * @return the name of \u003ccode\u003ecls\u003c/code\u003e, or \u003ccode\u003enull\u003c/code\u003e if if \u003ccode\u003ecls\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 50)"
      ]
    }
  ]
}