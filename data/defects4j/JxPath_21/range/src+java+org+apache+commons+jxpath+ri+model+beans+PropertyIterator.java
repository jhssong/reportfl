{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/ri/model/beans/PropertyIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PropertyIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodeIterator"
      ],
      "begin_line": 30,
      "end_line": 326,
      "comment": "\n * Iterates property values of an object pointed at with a {@link PropertyOwnerPointer}.\n * Examples of such objects are JavaBeans and objects with Dynamic Properties.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
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
      "begin_line": 49,
      "end_line": 84,
      "comment": "\n     * Create a new PropertyIterator.\n     * @param pointer owning pointer\n     * @param name property name\n     * @param reverse iteration order\n     * @param startWith beginning pointer\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 55,col 67)",
        "(line 56,col 9)-(line 56,col 25)",
        "(line 57,col 9)-(line 57,col 31)",
        "(line 58,col 9)-(line 58,col 33)",
        "(line 59,col 9)-(line 62,col 9)",
        "(line 63,col 9)-(line 83,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.getPropertyPointer()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Get the property pointer.\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.reset()",
      "begin_line": 97,
      "end_line": 100,
      "comment": "\n     * Reset property iteration.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 21)",
        "(line 99,col 9)-(line 99,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.getNodePointer()",
      "begin_line": 102,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 131,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.getPosition()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(int)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(int)",
      "begin_line": 147,
      "end_line": 187,
      "comment": "\n     * Set position for an individual property.\n     * @param position int position\n     * @return whether this was a valid position\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 33)",
        "(line 149,col 9)-(line 151,col 9)",
        "(line 153,col 9)-(line 155,col 9)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 161,col 9)-(line 161,col 33)",
        "(line 162,col 9)-(line 162,col 18)",
        "(line 163,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 48)",
        "(line 186,col 9)-(line 186,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionAllProperties(int)",
      "begin_line": 194,
      "end_line": 260,
      "comment": "\n     * Set position for all properties\n     * @param position int position\n     * @return whether this was a valid position\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 33)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 200,col 9)-(line 200,col 19)",
        "(line 201,col 9)-(line 201,col 59)",
        "(line 202,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.prepareForIndividualProperty(java.lang.String)",
      "begin_line": 266,
      "end_line": 309,
      "comment": "\n     * Prepare for an individual property.\n     * @param name property name\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 27)",
        "(line 268,col 9)-(line 268,col 21)",
        "(line 270,col 9)-(line 270,col 64)",
        "(line 271,col 9)-(line 308,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.getLength()",
      "begin_line": 315,
      "end_line": 325,
      "comment": "\n     * Computes length for the current pointer - ignores any exceptions.\n     * @return length\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 19)",
        "(line 317,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 22)"
      ]
    }
  ]
}