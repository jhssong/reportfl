{
  "filepath": "/tmp/JxPath-17b/src/java/org/apache/commons/jxpath/ri/model/jdom/JDOMNamespaceIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JDOMNamespaceIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodeIterator"
      ],
      "begin_line": 36,
      "end_line": 118,
      "comment": "\n * An iterator of namespaces of a DOM Node.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespaces"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prefixes"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "position"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator.JDOMNamespaceIterator(org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 46,
      "end_line": 57,
      "comment": "\n     * Create a new JDOMNamespaceIterator.\n     * @param parent the parent NodePointer.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 29)",
        "(line 48,col 9)-(line 48,col 39)",
        "(line 49,col 9)-(line 51,col 9)",
        "(line 52,col 9)-(line 56,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator.collectNamespaces(org.jdom.Element)",
      "begin_line": 63,
      "end_line": 81,
      "comment": "\n     * Collect the namespaces from a JDOM Element.\n     * @param element the source Element\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 46)",
        "(line 65,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 69,col 56)",
        "(line 70,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 51)",
        "(line 78,col 9)-(line 80,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator.getNodePointer()",
      "begin_line": 86,
      "end_line": 99,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 33)",
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 57)",
        "(line 98,col 9)-(line 98,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator.getPosition()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator.setPosition(int)",
      "begin_line": 111,
      "end_line": 117,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 33)",
        "(line 116,col 9)-(line 116,col 62)"
      ]
    }
  ]
}