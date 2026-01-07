{
  "filepath": "/tmp/JxPath-2b/src/java/org/apache/commons/jxpath/ri/model/beans/BeanPropertyPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BeanPropertyPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.beans.PropertyPointer"
      ],
      "begin_line": 34,
      "end_line": 293,
      "comment": "\n * Pointer pointing to a property of a JavaBean.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "propertyName"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "beanInfo"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propertyDescriptors"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propertyDescriptor"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "names"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNINITIALIZED"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseValue"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.BeanPropertyPointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.JXPathBeanInfo)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 22)",
        "(line 47,col 9)-(line 47,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.isContainer()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * This type of node is auxiliary.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyCount()",
      "begin_line": 60,
      "end_line": 65,
      "comment": "\n     * Number of the bean\u0027s properties.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyNames()",
      "begin_line": 70,
      "end_line": 79,
      "comment": "\n     * Names of all properties, sorted alphabetically\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 78,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.setPropertyName(java.lang.String)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Select a property by name\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 47)",
        "(line 86,col 9)-(line 86,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.setPropertyIndex(int)",
      "begin_line": 92,
      "end_line": 100,
      "comment": "\n     * Selects a property by its offset in the alphabetically sorted list.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 99,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getBaseValue()",
      "begin_line": 105,
      "end_line": 114,
      "comment": "\n     * The value of the currently selected property.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.setIndex(int)",
      "begin_line": 116,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getImmediateNode()",
      "begin_line": 135,
      "end_line": 151,
      "comment": "\n     * If index \u003d\u003d WHOLE_COLLECTION, the value of the property, otherwise\n     * the value of the index\u0027th element of the collection represented by the\n     * property. If the property is not a collection, index should be zero\n     * and the value will be the property itself.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.isActualProperty()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.isCollection()",
      "begin_line": 157,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 56)",
        "(line 159,col 9)-(line 161,col 9)",
        "(line 163,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 167,col 70)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 175,col 9)-(line 175,col 38)",
        "(line 176,col 9)-(line 176,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getLength()",
      "begin_line": 183,
      "end_line": 200,
      "comment": "\n     * If the property contains a collection, then the length of that\n     * collection, otherwise - 1.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 56)",
        "(line 185,col 9)-(line 187,col 9)",
        "(line 189,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 195,col 70)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.setValue(java.lang.Object)",
      "begin_line": 207,
      "end_line": 221,
      "comment": "\n     * If index \u003d\u003d WHOLE_COLLECTION, change the value of the property, otherwise\n     * change the value of the index\u0027th element of the collection\n     * represented by the property.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 56)",
        "(line 209,col 9)-(line 212,col 9)",
        "(line 214,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 226,
      "end_line": 233,
      "comment": "\n     * @see PropertyPointer#createPath(JXPathContext)\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.remove()",
      "begin_line": 235,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 236,col 9)-(line 246,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyName()",
      "begin_line": 252,
      "end_line": 260,
      "comment": "\n     * Name of the currently selected property.\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyDescriptor()",
      "begin_line": 266,
      "end_line": 285,
      "comment": "\n     * Finds the property descriptor corresponding to the current property\n     * index.\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyDescriptors()",
      "begin_line": 287,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 291,col 35)"
      ]
    }
  ]
}