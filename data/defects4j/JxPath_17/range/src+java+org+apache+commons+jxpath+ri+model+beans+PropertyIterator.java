{
  "filepath": "/tmp/JxPath-17b/src/java/org/apache/commons/jxpath/ri/model/beans/PropertyIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PropertyIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodeIterator"
      ],
      "begin_line": 30,
      "end_line": 335,
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
      "begin_line": 105,
      "end_line": 135,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.getPosition()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(int)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(int)",
      "begin_line": 156,
      "end_line": 196,
      "comment": "\n     * Set position for an individual property.\n     * @param position int position\n     * @return whether this was a valid position\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 33)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 170,col 9)-(line 170,col 33)",
        "(line 171,col 9)-(line 171,col 18)",
        "(line 172,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 48)",
        "(line 195,col 9)-(line 195,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionAllProperties(int)",
      "begin_line": 203,
      "end_line": 269,
      "comment": "\n     * Set position for all properties\n     * @param position int position\n     * @return whether this was a valid position\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 33)",
        "(line 205,col 9)-(line 207,col 9)",
        "(line 209,col 9)-(line 209,col 19)",
        "(line 210,col 9)-(line 210,col 59)",
        "(line 211,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.prepareForIndividualProperty(java.lang.String)",
      "begin_line": 275,
      "end_line": 318,
      "comment": "\n     * Prepare for an individual property.\n     * @param name property name\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 27)",
        "(line 277,col 9)-(line 277,col 21)",
        "(line 279,col 9)-(line 279,col 64)",
        "(line 280,col 9)-(line 317,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyIterator.getLength()",
      "begin_line": 324,
      "end_line": 334,
      "comment": "\n     * Computes length for the current pointer - ignores any exceptions.\n     * @return length\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 19)",
        "(line 326,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 333,col 22)"
      ]
    }
  ]
}