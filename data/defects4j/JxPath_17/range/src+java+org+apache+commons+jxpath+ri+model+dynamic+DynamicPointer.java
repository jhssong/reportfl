{
  "filepath": "/tmp/JxPath-17b/src/java/org/apache/commons/jxpath/ri/model/dynamic/DynamicPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DynamicPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer"
      ],
      "begin_line": 38,
      "end_line": 169,
      "comment": "\n * A  Pointer that points to an object with Dynamic Properties. It is used for\n * the first element of a path; following elements will by of type\n * PropertyPointer.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bean"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.DynamicPointer(org.apache.commons.jxpath.ri.QName, java.lang.Object, org.apache.commons.jxpath.DynamicPropertyHandler, java.util.Locale)",
      "begin_line": 50,
      "end_line": 56,
      "comment": "\n     * Create a new DynamicPointer.\n     * @param name property name\n     * @param bean owning bean\n     * @param handler DynamicPropertyHandler\n     * @param locale Locale\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 28)",
        "(line 53,col 9)-(line 53,col 25)",
        "(line 54,col 9)-(line 54,col 25)",
        "(line 55,col 9)-(line 55,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.DynamicPointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.QName, java.lang.Object, org.apache.commons.jxpath.DynamicPropertyHandler)",
      "begin_line": 65,
      "end_line": 71,
      "comment": "\n     * Create a new DynamicPointer.\n     * @param parent parent pointer\n     * @param name property name\n     * @param bean owning bean\n     * @param handler DynamicPropertyHandler\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 22)",
        "(line 68,col 9)-(line 68,col 25)",
        "(line 69,col 9)-(line 69,col 25)",
        "(line 70,col 9)-(line 70,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.getPropertyPointer()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.createNodeIterator(java.lang.String, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.getName()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.isDynamicPropertyDeclarationSupported()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.getBaseValue()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Returns the DP object iself.\n     * @return Object\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.isLeaf()",
      "begin_line": 120,
      "end_line": 123,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 33)",
        "(line 122,col 9)-(line 122,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.isCollection()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.getLength()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Returns 1.\n     * @return int\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.asPath()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.hashCode()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.equals(java.lang.Object)",
      "begin_line": 157,
      "end_line": 168,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 166,col 55)",
        "(line 167,col 9)-(line 167,col 61)"
      ]
    }
  ]
}