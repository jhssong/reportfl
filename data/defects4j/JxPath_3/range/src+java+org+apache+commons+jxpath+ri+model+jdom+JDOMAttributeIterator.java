{
  "filepath": "/tmp/JxPath-3b/src/java/org/apache/commons/jxpath/ri/model/jdom/JDOMAttributeIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JDOMAttributeIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodeIterator"
      ],
      "begin_line": 36,
      "end_line": 190,
      "comment": "\n * An iterator of attributes of a DOM Node.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
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
        "name"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attributes"
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
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator.JDOMAttributeIterator(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 42,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 29)",
        "(line 44,col 9)-(line 44,col 25)",
        "(line 45,col 9)-(line 86,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator.getNodePointer()",
      "begin_line": 163,
      "end_line": 177,
      "comment": "\n    private boolean testAttr(Attr attr, QName testName) {\n        String nodePrefix \u003d DOMNodePointer.getPrefix(attr);\n        String nodeLocalName \u003d DOMNodePointer.getLocalName(attr);\n\n        if (nodePrefix !\u003d null \u0026\u0026 nodePrefix.equals(\"xmlns\")) {\n            return false;\n        }\n\n        if (nodePrefix \u003d\u003d null \u0026\u0026 nodeLocalName.equals(\"xmlns\")) {\n            return false;\n        }\n\n        String testLocalName \u003d name.getName();\n        if (testLocalName.equals(\"*\") || testLocalName.equals(nodeLocalName)) {\n            String testPrefix \u003d testName.getPrefix();\n\n            if (equalStrings(testPrefix, nodePrefix)) {\n                return true;\n            }\n\n            String testNS \u003d null;\n            if (testPrefix !\u003d null) {\n                testNS \u003d parent.getNamespaceURI(testPrefix);\n            }\n\n            String nodeNS \u003d null;\n            if (nodePrefix !\u003d null) {\n                nodeNS \u003d parent.getNamespaceURI(nodePrefix);\n            }\n            return equalStrings(testNS, nodeNS);\n        }\n        return false;\n    }\n\n    private static boolean equalStrings(String s1, String s2) {\n        if (s1 \u003d\u003d null \u0026\u0026 s2 !\u003d null) {\n            return false;\n        }\n        if (s1 !\u003d null \u0026\u0026 !s1.equals(s2)) {\n            return false;\n        }\n        return true;\n    }\n\n    private Attr getAttribute(Element element, QName name) {\n        String testPrefix \u003d name.getPrefix();\n        String testNS \u003d null;\n\n        if (testPrefix !\u003d null) {\n            testNS \u003d parent.getNamespaceURI(testPrefix);\n        }\n\n        if (testNS !\u003d null) {\n            Attr attr \u003d element.getAttributeNodeNS(testNS, name.getName());\n            if (attr \u003d\u003d null) {\n                // This may mean that the parser does not support NS for\n                // attributes, example - the version of Crimson bundled\n                // with JDK 1.4.0\n                NamedNodeMap nnm \u003d element.getAttributes();\n                for (int i \u003d 0; i \u003c nnm.getLength(); i++) {\n                    attr \u003d (Attr)nnm.item(i);\n                    if (testAttr(attr, name)) {\n                        return attr;\n                    }\n                }\n            }\n            return attr;\n        }\n        else {\n            return element.getAttributeNode(name.getName());\n        }\n    }\n",
      "child_ranges": [
        "(line 164,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 33)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 176,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator.getPosition()",
      "begin_line": 179,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator.setPosition(int)",
      "begin_line": 183,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 33)",
        "(line 188,col 9)-(line 188,col 62)"
      ]
    }
  ]
}