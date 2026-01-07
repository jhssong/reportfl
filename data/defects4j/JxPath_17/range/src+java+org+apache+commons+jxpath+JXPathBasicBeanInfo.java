{
  "filepath": "/tmp/JxPath-17b/src/java/org/apache/commons/jxpath/JXPathBasicBeanInfo.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JXPathBasicBeanInfo",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.JXPathBeanInfo"
      ],
      "begin_line": 37,
      "end_line": 173,
      "comment": "\n * An implementation of JXPathBeanInfo based on JavaBeans\u0027 BeanInfo. Properties\n * advertised by JXPathBasicBeanInfo are the same as those advertised by\n * BeanInfo for the corresponding class.\n *\n * See java.beans.BeanInfo, java.beans.Introspector\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "atomic"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "clazz"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propertyDescriptors"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dynamicPropertyHandlerClass"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propertyDescriptorMap"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.JXPathBasicBeanInfo(java.lang.Class)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Create a new JXPathBasicBeanInfo.\n     * @param clazz bean class\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.JXPathBasicBeanInfo(java.lang.Class, boolean)",
      "begin_line": 58,
      "end_line": 61,
      "comment": "\n     * Create a new JXPathBasicBeanInfo.\n     * @param clazz bean class\n     * @param atomic whether objects of this class are treated as atomic\n     *               objects which have no properties of their own.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 27)",
        "(line 60,col 9)-(line 60,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.JXPathBasicBeanInfo(java.lang.Class, java.lang.Class)",
      "begin_line": 68,
      "end_line": 72,
      "comment": "\n     * Create a new JXPathBasicBeanInfo.\n     * @param clazz bean class\n     * @param dynamicPropertyHandlerClass dynamic property handler class\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 27)",
        "(line 70,col 9)-(line 70,col 28)",
        "(line 71,col 9)-(line 71,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.isAtomic()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Returns true if objects of this class are treated as atomic\n     * objects which have no properties of their own.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.isDynamic()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Return true if the corresponding objects have dynamic properties.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.getPropertyDescriptors()",
      "begin_line": 94,
      "end_line": 125,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.Anonymous-7aed8df5-79f4-4710-bdab-0e84759eebec.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 112,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 113,col 29)-(line 114,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.getPropertyDescriptor(java.lang.String)",
      "begin_line": 130,
      "end_line": 139,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.getDynamicPropertyHandlerClass()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * For  a dynamic class, returns the corresponding DynamicPropertyHandler\n     * class.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.toString()",
      "begin_line": 152,
      "end_line": 172,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 49)",
        "(line 154,col 9)-(line 154,col 44)",
        "(line 155,col 9)-(line 155,col 39)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 41)",
        "(line 163,col 9)-(line 163,col 61)",
        "(line 164,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 27)",
        "(line 171,col 9)-(line 171,col 33)"
      ]
    }
  ]
}