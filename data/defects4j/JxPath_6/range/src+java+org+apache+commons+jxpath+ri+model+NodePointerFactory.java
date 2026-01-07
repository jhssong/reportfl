{
  "filepath": "/tmp/JxPath-6b/src/java/org/apache/commons/jxpath/ri/model/NodePointerFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NodePointerFactory",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 57,
      "comment": "\n * Creates NodePointers for objects of a certain type.\n * NodePointerFactories are ordered according to the values returned\n * by the \"getOrder\" method and always queried in that order.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointerFactory.getOrder()",
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * The factory order number determines its position between other factories.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointerFactory.createNodePointer(org.apache.commons.jxpath.ri.QName, java.lang.Object, java.util.Locale)",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Create a NodePointer for the supplied object.  The node will represent\n     * the \"root\" object for a path.\n     *\n     * @return  null if this factory does not recognize objects of the supplied\n     * type.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointerFactory.createNodePointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.QName, java.lang.Object)",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     * Create a NodePointer for the supplied child object.\n     * \u003cp\u003e\n     * @return null if this factory does not recognize objects of the supplied\n     * type.\n     ",
      "child_ranges": []
    }
  ]
}