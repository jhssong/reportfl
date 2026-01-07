{
  "filepath": "/tmp/JxPath-4b/src/java/org/apache/commons/jxpath/DynamicPropertyHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DynamicPropertyHandler",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 56,
      "comment": "\n * A generic mechanism for accessing collections of name/value pairs.\n * Examples of such collections are HashMap, Properties,\n * ServletContext.  In order to add support for a new such collection\n * type to JXPath, perform the following two steps:\n * \u003col\u003e\n * \u003cli\u003eBuild an implementation of the DynamicPropertyHandler interface\n * for the desired collection type.\u003c/li\u003e\n * \u003cli\u003eInvoke the static method {@link JXPathIntrospector#registerDynamicClass\n * JXPathIntrospector.registerDynamicClass(class, handlerClass)}\u003c/li\u003e\n * \u003c/ol\u003e\n * JXPath allows access to dynamic properties using these three formats:\n * \u003cul\u003e\n * \u003cli\u003e\u003ccode\u003e\"myMap/myKey\"\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003e\u003ccode\u003e\"myMap[@name \u003d \u0027myKey\u0027]\"\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003e\u003ccode\u003e\"myMap[name(.) \u003d \u0027myKey\u0027]\"\u003c/code\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.DynamicPropertyHandler.getPropertyNames(java.lang.Object)",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Returns a list of dynamic property names for the supplied object.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.DynamicPropertyHandler.getProperty(java.lang.Object, java.lang.String)",
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Returns the value of the specified dynamic property.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.DynamicPropertyHandler.setProperty(java.lang.Object, java.lang.String, java.lang.Object)",
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Modifies the value of the specified dynamic property.\n     ",
      "child_ranges": []
    }
  ]
}