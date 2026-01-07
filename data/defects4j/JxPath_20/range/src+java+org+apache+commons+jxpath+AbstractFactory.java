{
  "filepath": "/tmp/JxPath-20b/src/java/org/apache/commons/jxpath/AbstractFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 72,
      "comment": "\n * The  {@link JXPathContext#createPath JXPathContext.createPath()} method of\n * JXPathContext can create missing objects as it traverses an XPath; it\n * utilizes an AbstractFactory for that purpose. Install a factory on\n * JXPathContext by calling {@link JXPathContext#setFactory JXPathContext.\n * setFactory()}.\n * \u003cp\u003e\n * All  methods of this class return false.  Override any of them to return true\n * to indicate that the factory has successfully created the described object.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.AbstractFactory.createObject(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.Pointer, java.lang.Object, java.lang.String, int)",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n     * The  parameters may describe a collection element or an individual\n     * object. It is up to the factory to infer which one it is. If it is a\n     * collection, the factory should check if the collection exists.  If not,\n     * it should create the collection. Then it should create the index\u0027th\n     * element of the collection and return true.\n     * \u003cp\u003e\n     *\n     * @param context can be used to evaluate other XPaths, get to variables\n     * etc.\n     * @param pointer describes the location of the node to be created\n     * @param parent is the object that will serve as a parent of the new\n     * object\n     * @param name is the name of the child of the parent that needs to be\n     * created. In the case of DOM may be qualified.\n     * @param index is used if the pointer represents a collection element. You\n     * may need to expand or even create the collection to accommodate the new\n     * element.\n     *\n     * @return true if the object was successfully created\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.AbstractFactory.declareVariable(org.apache.commons.jxpath.JXPathContext, java.lang.String)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Declare the specified variable\n     *\n     * @param context hosts variable pools. See\n     * {@link JXPathContext#getVariables() JXPathContext.getVariables()}\n     * @param name is the name of the variable without the \"$\" sign\n     *\n     * @return true if the variable was successfully defined\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 21)"
      ]
    }
  ]
}