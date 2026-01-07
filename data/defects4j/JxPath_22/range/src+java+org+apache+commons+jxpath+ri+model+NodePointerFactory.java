{
  "filepath": "/tmp/JxPath-22b/src/java/org/apache/commons/jxpath/ri/model/NodePointerFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NodePointerFactory",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 64,
      "comment": "\n * Creates NodePointers for objects of a certain type.\n * NodePointerFactories are ordered according to the values returned\n * by the \"getOrder\" method and always queried in that order.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointerFactory.getOrder()",
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * The factory order number determines its position between other factories.\n     * @return int order\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointerFactory.createNodePointer(org.apache.commons.jxpath.ri.QName, java.lang.Object, java.util.Locale)",
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Create a NodePointer for the supplied object.  The node will represent\n     * the \"root\" object for a path.\n     *\n     * @param name String node name\n     * @param object child object\n     * @param locale Locale\n     * @return  null if this factory does not recognize objects of the supplied\n     * type.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointerFactory.createNodePointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.QName, java.lang.Object)",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n     * Create a NodePointer for the supplied child object.\n     *\n     * @param parent parent node\n     * @param name String node name\n     * @param object child object\n     * @return null if this factory does not recognize objects of the supplied\n     * type.\n     ",
      "child_ranges": []
    }
  ]
}