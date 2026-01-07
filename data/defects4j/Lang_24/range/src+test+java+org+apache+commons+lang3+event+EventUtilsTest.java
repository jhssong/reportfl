{
  "filepath": "/tmp/Lang-24b/src/test/java/org/apache/commons/lang3/event/EventUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EventUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 36,
      "end_line": 252,
      "comment": "\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testAddEventListener()",
      "begin_line": 38,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 68)",
        "(line 41,col 9)-(line 41,col 88)",
        "(line 42,col 9)-(line 42,col 95)",
        "(line 43,col 9)-(line 43,col 65)",
        "(line 44,col 9)-(line 44,col 81)",
        "(line 45,col 9)-(line 45,col 65)",
        "(line 46,col 9)-(line 46,col 36)",
        "(line 47,col 9)-(line 47,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testAddEventListenerWithNoAddMethod()",
      "begin_line": 50,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 68)",
        "(line 53,col 9)-(line 53,col 88)",
        "(line 54,col 9)-(line 54,col 91)",
        "(line 55,col 9)-(line 63,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testAddEventListenerThrowsException()",
      "begin_line": 66,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 68)",
        "(line 69,col 9)-(line 83,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.Anonymous-7904f2a6-cf0b-418c-adf3-785618c6cc7d.propertyChange(java.beans.PropertyChangeEvent)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testAddEventListenerWithPrivateAddMethod()",
      "begin_line": 86,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 68)",
        "(line 89,col 9)-(line 89,col 88)",
        "(line 90,col 9)-(line 90,col 95)",
        "(line 91,col 9)-(line 99,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testBindEventsToMethod()",
      "begin_line": 102,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 68)",
        "(line 105,col 9)-(line 105,col 56)",
        "(line 106,col 9)-(line 106,col 99)",
        "(line 107,col 9)-(line 107,col 44)",
        "(line 108,col 9)-(line 108,col 36)",
        "(line 109,col 9)-(line 109,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testBindEventsToMethodWithEvent()",
      "begin_line": 113,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 68)",
        "(line 116,col 9)-(line 116,col 74)",
        "(line 117,col 9)-(line 117,col 99)",
        "(line 118,col 9)-(line 118,col 44)",
        "(line 119,col 9)-(line 119,col 36)",
        "(line 120,col 9)-(line 120,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testBindFilteredEventsToMethod()",
      "begin_line": 124,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 66)",
        "(line 127,col 9)-(line 127,col 56)",
        "(line 128,col 9)-(line 128,col 108)",
        "(line 129,col 9)-(line 129,col 44)",
        "(line 130,col 9)-(line 130,col 86)",
        "(line 131,col 9)-(line 131,col 44)",
        "(line 132,col 9)-(line 132,col 86)",
        "(line 133,col 9)-(line 133,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultipleEventListener",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 136,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.MultipleEventListener.event1(java.beans.PropertyChangeEvent)",
      "begin_line": 138,
      "end_line": 138,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.MultipleEventListener.event2(java.beans.PropertyChangeEvent)",
      "begin_line": 140,
      "end_line": 140,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "EventCounter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 143,
      "end_line": 156,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCounter.eventOccurred()",
      "begin_line": 147,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 13)-(line 149,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCounter.getCount()",
      "begin_line": 152,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 13)-(line 154,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EventCounterWithEvent",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 158,
      "end_line": 171,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCounterWithEvent.eventOccurred(java.beans.PropertyChangeEvent)",
      "begin_line": 162,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 13)-(line 164,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCounterWithEvent.getCount()",
      "begin_line": 167,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 169,col 13)-(line 169,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EventCountingInvociationHandler",
      "is_interface": false,
      "parent_types": [
        "java.lang.reflect.InvocationHandler"
      ],
      "begin_line": 174,
      "end_line": 204,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "eventCounts"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCountingInvociationHandler.createListener(java.lang.Class\u003cL\u003e)",
      "begin_line": 178,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 180,col 13)-(line 182,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCountingInvociationHandler.getEventCount(java.lang.String)",
      "begin_line": 185,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 187,col 13)-(line 187,col 55)",
        "(line 188,col 13)-(line 188,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCountingInvociationHandler.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])",
      "begin_line": 191,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 193,col 13)-(line 193,col 62)",
        "(line 194,col 13)-(line 201,col 13)",
        "(line 202,col 13)-(line 202,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultipleEventSource",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 206,
      "end_line": 214,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "listeners"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.MultipleEventSource.addMultipleEventListener(org.apache.commons.lang3.event.EventUtilsTest.MultipleEventListener)",
      "begin_line": 210,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 212,col 13)-(line 212,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExceptionEventSource",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 216,
      "end_line": 222,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.ExceptionEventSource.addPropertyChangeListener(java.beans.PropertyChangeListener)",
      "begin_line": 218,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 220,col 13)-(line 220,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PropertyChangeSource",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 224,
      "end_line": 251,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "listeners"
      ],
      "begin_line": 226,
      "end_line": 226,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "property"
      ],
      "begin_line": 228,
      "end_line": 228,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.PropertyChangeSource.setProperty(java.lang.String)",
      "begin_line": 230,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 232,col 13)-(line 232,col 44)",
        "(line 233,col 13)-(line 233,col 37)",
        "(line 234,col 13)-(line 234,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.PropertyChangeSource.addVetoableChangeListener(java.beans.VetoableChangeListener)",
      "begin_line": 237,
      "end_line": 240,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.PropertyChangeSource.addPropertyChangeListener(java.beans.PropertyChangeListener)",
      "begin_line": 242,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 244,col 13)-(line 244,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.PropertyChangeSource.removePropertyChangeListener(java.beans.PropertyChangeListener)",
      "begin_line": 247,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 249,col 13)-(line 249,col 47)"
      ]
    }
  ]
}