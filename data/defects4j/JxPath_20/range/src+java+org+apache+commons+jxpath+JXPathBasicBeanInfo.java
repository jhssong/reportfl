{
  "filepath": "/tmp/JxPath-20b/src/java/org/apache/commons/jxpath/JXPathBasicBeanInfo.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JXPathBasicBeanInfo",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.JXPathBeanInfo"
      ],
      "begin_line": 38,
      "end_line": 175,
      "comment": "\n * An implementation of JXPathBeanInfo based on JavaBeans\u0027 BeanInfo. Properties\n * advertised by JXPathBasicBeanInfo are the same as those advertised by\n * BeanInfo for the corresponding class.\n *\n * @see java.beans.BeanInfo\n * @see java.beans.Introspector\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PROPERTY_DESCRIPTOR_COMPARATOR"
      ],
      "begin_line": 41,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.Anonymous-a3de72e1-e731-40b4-9e81-af6bf0527df2.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 43,col 13)-(line 44,col 56)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "atomic"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "clazz"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dynamicPropertyHandlerClass"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propertyDescriptors"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propertyDescriptorMap"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.JXPathBasicBeanInfo(java.lang.Class)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Create a new JXPathBasicBeanInfo.\n     * @param clazz bean class\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.JXPathBasicBeanInfo(java.lang.Class, boolean)",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * Create a new JXPathBasicBeanInfo.\n     * @param clazz bean class\n     * @param atomic whether objects of this class are treated as atomic\n     *               objects which have no properties of their own.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 27)",
        "(line 70,col 9)-(line 70,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.JXPathBasicBeanInfo(java.lang.Class, java.lang.Class)",
      "begin_line": 78,
      "end_line": 82,
      "comment": "\n     * Create a new JXPathBasicBeanInfo.\n     * @param clazz bean class\n     * @param dynamicPropertyHandlerClass dynamic property handler class\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 27)",
        "(line 80,col 9)-(line 80,col 28)",
        "(line 81,col 9)-(line 81,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.isAtomic()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Returns true if objects of this class are treated as atomic\n     * objects which have no properties of their own.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.isDynamic()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Return true if the corresponding objects have dynamic properties.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.getPropertyDescriptors()",
      "begin_line": 101,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 89)",
        "(line 130,col 9)-(line 130,col 88)",
        "(line 131,col 9)-(line 131,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.getPropertyDescriptor(java.lang.String)",
      "begin_line": 134,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.getDynamicPropertyHandlerClass()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * For a dynamic class, returns the corresponding DynamicPropertyHandler\n     * class.\n     * @return Class\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.toString()",
      "begin_line": 154,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 49)",
        "(line 156,col 9)-(line 156,col 44)",
        "(line 157,col 9)-(line 157,col 39)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 41)",
        "(line 165,col 9)-(line 165,col 61)",
        "(line 166,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 27)",
        "(line 173,col 9)-(line 173,col 33)"
      ]
    }
  ]
}