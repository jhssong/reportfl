{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/ri/model/dynamic/DynamicAttributeIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DynamicAttributeIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"
      ],
      "begin_line": 31,
      "end_line": 46,
      "comment": "\n * \u003ccode\u003eDynamicAttributeIterator\u003c/code\u003e is different from a regular\n * \u003ccode\u003eBeanAttributeIterator\u003c/code\u003e in that given a property name it\n * will always find that property (albeit with a null value).\n *\n * @author \u003ca href\u003d\"mailto:dmitri@apache.org\"\u003eDmitri Plotnikov\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator.DynamicAttributeIterator(org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Create a new DynamicAttributeIterator.\n     * @param parent pointer\n     * @param name to match properties\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator.prepareForIndividualProperty(java.lang.String)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 43,col 10)-(line 43,col 79)",
        "(line 44,col 10)-(line 44,col 50)"
      ]
    }
  ]
}