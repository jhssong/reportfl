{
  "filepath": "/tmp/JxPath-13b/src/java/org/apache/commons/jxpath/Pointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Pointer",
      "is_interface": true,
      "parent_types": [
        "java.lang.Cloneable",
        "java.lang.Comparable",
        "java.io.Serializable"
      ],
      "begin_line": 38,
      "end_line": 90,
      "comment": "\n * Pointers represent locations of objects and their properties\n * in Java object graphs. JXPathContext has methods\n * ({@link JXPathContext#getPointer(java.lang.String) getPointer()}\n * and  ({@link JXPathContext#iteratePointers(java.lang.String)\n * iteratePointers()}, which, given an XPath, produce Pointers for the objects\n * or properties described the the path. For example, \u003ccode\u003ectx.getPointer\n * (\"foo/bar\")\u003c/code\u003e will produce a Pointer that can get and set the property\n * \"bar\" of the object which is the value of the property \"foo\" of the root\n * object. The value of \u003ccode\u003ectx.getPointer(\"aMap/aKey[3]\")\u003c/code\u003e will be a\n * pointer to the 3\u0027rd element of the array, which is the value for the key\n * \"aKey\" of the map, which is the value of the property \"aMap\" of the root\n * object.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.Pointer.getValue()",
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Returns the value of the object, property or collection element\n     * this pointer represents. May convert the value to one of the \n     * canonical InfoSet types: String, Number, Boolean, Set.\n     * \n     * For example, in the case of an XML element, getValue() will\n     * return the text contained by the element rather than \n     * the element itself.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.Pointer.getNode()",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Returns the raw value of the object, property or collection element\n     * this pointer represents.  Never converts the object to a\n     * canonical type: returns it as is. \n     * \n     * For example, for an XML element, getNode() will\n     * return the element itself rather than the text it contains.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.Pointer.setValue(java.lang.Object)",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Modifies the value of the object, property or collection element\n     * this pointer represents.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.Pointer.getRootNode()",
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Returns the node this pointer is based on. \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.Pointer.asPath()",
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * Returns a string that is a proper \"canonical\" XPath that corresponds to\n     * this pointer.  Consider this example:\n     * \u003cp\u003e\u003ccode\u003ePointer  ptr \u003d ctx.getPointer(\"//employees[firstName \u003d \u0027John\u0027]\")\n     * \u003c/code\u003e\n     * \u003cp\u003eThe  value of \u003ccode\u003eptr.asPath()\u003c/code\u003e will look something like\n     * \u003ccode\u003e\"/departments[2]/employees[3]\"\u003c/code\u003e, so, basically, it represents\n     * the concrete location(s) of the result of a search performed by JXPath.\n     * If an object in the pointer\u0027s path is a Dynamic Property object (like a\n     * Map), the asPath method generates an XPath that looks like this: \u003ccode\u003e\"\n     * /departments[@name \u003d \u0027HR\u0027]/employees[3]\"\u003c/code\u003e.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.Pointer.clone()",
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * Pointers are cloneable\n     ",
      "child_ranges": []
    }
  ]
}