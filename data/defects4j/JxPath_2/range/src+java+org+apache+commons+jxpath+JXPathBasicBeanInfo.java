{
  "filepath": "/tmp/JxPath-2b/src/java/org/apache/commons/jxpath/JXPathBasicBeanInfo.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JXPathBasicBeanInfo",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.JXPathBeanInfo"
      ],
      "begin_line": 36,
      "end_line": 154,
      "comment": "\n * An implementation of JXPathBeanInfo based on JavaBeans\u0027 BeanInfo. Properties\n * advertised by JXPathBasicBeanInfo are the same as those advertised by\n * BeanInfo for the corresponding class.\n *\n * See java.beans.BeanInfo, java.beans.Introspector\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "atomic"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "clazz"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propertyDescriptors"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propertyNames"
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
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.JXPathBasicBeanInfo(java.lang.Class)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.JXPathBasicBeanInfo(java.lang.Class, boolean)",
      "begin_line": 47,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 27)",
        "(line 49,col 9)-(line 49,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.JXPathBasicBeanInfo(java.lang.Class, java.lang.Class)",
      "begin_line": 52,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 27)",
        "(line 54,col 9)-(line 54,col 28)",
        "(line 55,col 9)-(line 55,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.isAtomic()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Returns true if objects of this class are treated as atomic\n     * objects which have no properties of their own.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.isDynamic()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Return true if the corresponding objects have dynamic properties.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.getPropertyDescriptors()",
      "begin_line": 73,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.Anonymous-163c9a29-e916-45a1-bee0-a454c8da13b0.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 88,col 25)-(line 89,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.getPropertyDescriptor(java.lang.String)",
      "begin_line": 101,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 109,col 9)",
        "(line 111,col 9)-(line 115,col 9)",
        "(line 117,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.getDynamicPropertyHandlerClass()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * For  a dynamic class, returns the corresponding DynamicPropertyHandler\n     * class.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.toString()",
      "begin_line": 133,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 49)",
        "(line 135,col 9)-(line 135,col 44)",
        "(line 136,col 9)-(line 136,col 39)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 41)",
        "(line 144,col 9)-(line 144,col 61)",
        "(line 145,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 27)",
        "(line 152,col 9)-(line 152,col 33)"
      ]
    }
  ]
}