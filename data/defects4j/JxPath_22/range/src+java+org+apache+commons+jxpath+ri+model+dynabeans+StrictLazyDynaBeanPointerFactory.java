{
  "filepath": "/tmp/JxPath-22b/src/java/org/apache/commons/jxpath/ri/model/dynabeans/StrictLazyDynaBeanPointerFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrictLazyDynaBeanPointerFactory",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointerFactory"
      ],
      "begin_line": 38,
      "end_line": 94,
      "comment": "\n * Implemented in response to [JXPATH-144]. Optionally pluggable\n * \u003ccode\u003eNodePointerFactory\u003c/code\u003e that returns a special type of\n * \u003ccode\u003eNodePointer\u003c/code\u003e for \u003ccode\u003eLazyDynaBean\u003c/code\u003es. The\n * \u003ccode\u003ePropertyPointer\u003c/code\u003es returned by these will respect\n * {@link LazyDynaClass#isDynaProperty(String)} when determining\n * {@link PropertyPointer#isActual()}.\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "class_interface",
      "name": "StrictLazyDynaBeanPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer"
      ],
      "begin_line": 39,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lazyDynaBean"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory.StrictLazyDynaBeanPointer.StrictLazyDynaBeanPointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.QName, org.apache.commons.beanutils.LazyDynaBean)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n         * Create a new StrictLazyDynaBeanPointer instance.\n         * \n         * @param parent\n         * @param name\n         * @param lazyDynaBean\n         ",
      "child_ranges": [
        "(line 52,col 13)-(line 52,col 46)",
        "(line 53,col 13)-(line 53,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory.StrictLazyDynaBeanPointer.StrictLazyDynaBeanPointer(org.apache.commons.jxpath.ri.QName, org.apache.commons.beanutils.LazyDynaBean, java.util.Locale)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n         * Create a new StrictLazyDynaBeanPointer instance.\n         * \n         * @param name\n         * @param lazyDynaBean\n         * @param locale\n         ",
      "child_ranges": [
        "(line 64,col 13)-(line 64,col 46)",
        "(line 65,col 13)-(line 65,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory.StrictLazyDynaBeanPointer.getPropertyPointer()",
      "begin_line": 68,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 69,col 13)-(line 76,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory.StrictLazyDynaBeanPointer.Anonymous-916bb6d8-e034-4eb3-9546-494502ca2e28.isActualProperty()",
      "begin_line": 72,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 73,col 21)-(line 74,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory.getOrder()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory.createNodePointer(org.apache.commons.jxpath.ri.QName, java.lang.Object, java.util.Locale)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 86,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory.createNodePointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.QName, java.lang.Object)",
      "begin_line": 89,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 91,col 46)"
      ]
    }
  ]
}