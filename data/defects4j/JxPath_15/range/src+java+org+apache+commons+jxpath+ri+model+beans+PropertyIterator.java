{
  "filepath": "/tmp/JxPath-15b/src/java/org/apache/commons/jxpath/ri/model/beans/PropertyIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PropertyIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodeIterator"
      ],
      "begin_line": 30,
      "end_line": 298,
      "comment": "\n * Iterates property values of an object pointed at with a PropertyOwnerPointer.\n * Examples of such objects are JavaBeans and objects with Dynamic Properties.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "empty"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reverse"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "startIndex"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "targetReady"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "position"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propertyNodePointer"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "startPropertyIndex"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "includeStart"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.PropertyIterator(org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer, java.lang.String, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 42,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 49,col 67)",
        "(line 50,col 9)-(line 50,col 25)",
        "(line 51,col 9)-(line 51,col 31)",
        "(line 52,col 9)-(line 52,col 33)",
        "(line 53,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 77,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.getPropertyPointer()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.reset()",
      "begin_line": 84,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 21)",
        "(line 86,col 9)-(line 86,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.getNodePointer()",
      "begin_line": 89,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.getPosition()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(int)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(int)",
      "begin_line": 129,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 33)",
        "(line 131,col 9)-(line 133,col 9)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 143,col 9)-(line 143,col 33)",
        "(line 144,col 9)-(line 144,col 18)",
        "(line 145,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 48)",
        "(line 168,col 9)-(line 168,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionAllProperties(int)",
      "begin_line": 171,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 33)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 177,col 9)-(line 177,col 19)",
        "(line 178,col 9)-(line 178,col 59)",
        "(line 179,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.prepareForIndividualProperty(java.lang.String)",
      "begin_line": 239,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 27)",
        "(line 241,col 9)-(line 241,col 21)",
        "(line 243,col 9)-(line 243,col 64)",
        "(line 244,col 9)-(line 281,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.getLength()",
      "begin_line": 287,
      "end_line": 297,
      "comment": "\n     * Computes length for the current pointer - ignores any exceptions\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 19)",
        "(line 289,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 22)"
      ]
    }
  ]
}