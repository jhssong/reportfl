{
  "filepath": "/tmp/JxPath-2b/src/java/org/apache/commons/jxpath/ri/model/beans/PropertyIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PropertyIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodeIterator"
      ],
      "begin_line": 30,
      "end_line": 304,
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
        "ready"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "includeStart"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.PropertyIterator(org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer, java.lang.String, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 43,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 50,col 67)",
        "(line 51,col 9)-(line 51,col 25)",
        "(line 52,col 9)-(line 52,col 31)",
        "(line 53,col 9)-(line 53,col 33)",
        "(line 54,col 9)-(line 57,col 9)",
        "(line 58,col 9)-(line 78,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.getPropertyPointer()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.reset()",
      "begin_line": 85,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 21)",
        "(line 87,col 9)-(line 87,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.getNodePointer()",
      "begin_line": 90,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.getPosition()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(int)",
      "begin_line": 126,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(int)",
      "begin_line": 135,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 33)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 145,col 9)-(line 147,col 9)",
        "(line 149,col 9)-(line 149,col 33)",
        "(line 150,col 9)-(line 150,col 18)",
        "(line 151,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 48)",
        "(line 174,col 9)-(line 174,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionAllProperties(int)",
      "begin_line": 177,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 33)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 183,col 19)",
        "(line 184,col 9)-(line 184,col 59)",
        "(line 185,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 242,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.prepareForIndividualProperty(java.lang.String)",
      "begin_line": 245,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 27)",
        "(line 247,col 9)-(line 247,col 21)",
        "(line 249,col 9)-(line 249,col 64)",
        "(line 250,col 9)-(line 287,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.getLength()",
      "begin_line": 293,
      "end_line": 303,
      "comment": "\n     * Computes length for the current pointer - ignores any exceptions\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 19)",
        "(line 295,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 22)"
      ]
    }
  ]
}