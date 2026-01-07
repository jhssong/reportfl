{
  "filepath": "/tmp/JxPath-12b/src/java/org/apache/commons/jxpath/JXPathBasicBeanInfo.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JXPathBasicBeanInfo",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.JXPathBeanInfo"
      ],
      "begin_line": 37,
      "end_line": 142,
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
      "begin_line": 44,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.JXPathBasicBeanInfo(java.lang.Class, boolean)",
      "begin_line": 48,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 27)",
        "(line 50,col 9)-(line 50,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.JXPathBasicBeanInfo(java.lang.Class, java.lang.Class)",
      "begin_line": 53,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 27)",
        "(line 55,col 9)-(line 55,col 28)",
        "(line 56,col 9)-(line 56,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.isAtomic()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Returns true if objects of this class are treated as atomic\n     * objects which have no properties of their own.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.isDynamic()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Return true if the corresponding objects have dynamic properties.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.getPropertyDescriptors()",
      "begin_line": 74,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.Anonymous-5de86dcd-6f85-4442-94b9-edad899f164c.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 89,col 25)-(line 90,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.getPropertyDescriptor(java.lang.String)",
      "begin_line": 102,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.getDynamicPropertyHandlerClass()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * For  a dynamic class, returns the corresponding DynamicPropertyHandler\n     * class.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathBasicBeanInfo.toString()",
      "begin_line": 121,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 49)",
        "(line 123,col 9)-(line 123,col 44)",
        "(line 124,col 9)-(line 124,col 39)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 41)",
        "(line 132,col 9)-(line 132,col 61)",
        "(line 133,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 27)",
        "(line 140,col 9)-(line 140,col 33)"
      ]
    }
  ]
}