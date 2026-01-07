{
  "filepath": "/tmp/Lang-21b/src/test/java/org/apache/commons/lang3/event/EventUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EventUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 38,
      "end_line": 264,
      "comment": "\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testConstructor()",
      "begin_line": 41,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 40)",
        "(line 43,col 9)-(line 43,col 75)",
        "(line 44,col 9)-(line 44,col 37)",
        "(line 45,col 9)-(line 45,col 70)",
        "(line 46,col 9)-(line 46,col 79)",
        "(line 47,col 9)-(line 47,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testAddEventListener()",
      "begin_line": 50,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 68)",
        "(line 53,col 9)-(line 53,col 88)",
        "(line 54,col 9)-(line 54,col 95)",
        "(line 55,col 9)-(line 55,col 65)",
        "(line 56,col 9)-(line 56,col 81)",
        "(line 57,col 9)-(line 57,col 65)",
        "(line 58,col 9)-(line 58,col 36)",
        "(line 59,col 9)-(line 59,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testAddEventListenerWithNoAddMethod()",
      "begin_line": 62,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 68)",
        "(line 65,col 9)-(line 65,col 88)",
        "(line 66,col 9)-(line 66,col 91)",
        "(line 67,col 9)-(line 75,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testAddEventListenerThrowsException()",
      "begin_line": 78,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 68)",
        "(line 81,col 9)-(line 95,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.Anonymous-07ea1c3e-131c-45e9-b3de-6fa26ef488ce.propertyChange(java.beans.PropertyChangeEvent)",
      "begin_line": 85,
      "end_line": 88,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testAddEventListenerWithPrivateAddMethod()",
      "begin_line": 98,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 68)",
        "(line 101,col 9)-(line 101,col 88)",
        "(line 102,col 9)-(line 102,col 95)",
        "(line 103,col 9)-(line 111,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testBindEventsToMethod()",
      "begin_line": 114,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 68)",
        "(line 117,col 9)-(line 117,col 56)",
        "(line 118,col 9)-(line 118,col 99)",
        "(line 119,col 9)-(line 119,col 44)",
        "(line 120,col 9)-(line 120,col 36)",
        "(line 121,col 9)-(line 121,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testBindEventsToMethodWithEvent()",
      "begin_line": 125,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 68)",
        "(line 128,col 9)-(line 128,col 74)",
        "(line 129,col 9)-(line 129,col 99)",
        "(line 130,col 9)-(line 130,col 44)",
        "(line 131,col 9)-(line 131,col 36)",
        "(line 132,col 9)-(line 132,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testBindFilteredEventsToMethod()",
      "begin_line": 136,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 66)",
        "(line 139,col 9)-(line 139,col 56)",
        "(line 140,col 9)-(line 140,col 108)",
        "(line 141,col 9)-(line 141,col 44)",
        "(line 142,col 9)-(line 142,col 86)",
        "(line 143,col 9)-(line 143,col 44)",
        "(line 144,col 9)-(line 144,col 86)",
        "(line 145,col 9)-(line 145,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultipleEventListener",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 148,
      "end_line": 153,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.MultipleEventListener.event1(java.beans.PropertyChangeEvent)",
      "begin_line": 150,
      "end_line": 150,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.MultipleEventListener.event2(java.beans.PropertyChangeEvent)",
      "begin_line": 152,
      "end_line": 152,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "EventCounter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 155,
      "end_line": 168,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCounter.eventOccurred()",
      "begin_line": 159,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 161,col 13)-(line 161,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCounter.getCount()",
      "begin_line": 164,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 166,col 13)-(line 166,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EventCounterWithEvent",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 170,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCounterWithEvent.eventOccurred(java.beans.PropertyChangeEvent)",
      "begin_line": 174,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 176,col 13)-(line 176,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCounterWithEvent.getCount()",
      "begin_line": 179,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 181,col 13)-(line 181,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EventCountingInvociationHandler",
      "is_interface": false,
      "parent_types": [
        "java.lang.reflect.InvocationHandler"
      ],
      "begin_line": 186,
      "end_line": 216,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "eventCounts"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCountingInvociationHandler.createListener(java.lang.Class\u003cL\u003e)",
      "begin_line": 190,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 192,col 13)-(line 194,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCountingInvociationHandler.getEventCount(java.lang.String)",
      "begin_line": 197,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 199,col 13)-(line 199,col 55)",
        "(line 200,col 13)-(line 200,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCountingInvociationHandler.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])",
      "begin_line": 203,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 205,col 13)-(line 205,col 62)",
        "(line 206,col 13)-(line 213,col 13)",
        "(line 214,col 13)-(line 214,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultipleEventSource",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 218,
      "end_line": 226,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "listeners"
      ],
      "begin_line": 220,
      "end_line": 220,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.MultipleEventSource.addMultipleEventListener(org.apache.commons.lang3.event.EventUtilsTest.MultipleEventListener)",
      "begin_line": 222,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 224,col 13)-(line 224,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExceptionEventSource",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 228,
      "end_line": 234,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.ExceptionEventSource.addPropertyChangeListener(java.beans.PropertyChangeListener)",
      "begin_line": 230,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 232,col 13)-(line 232,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PropertyChangeSource",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 236,
      "end_line": 263,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "listeners"
      ],
      "begin_line": 238,
      "end_line": 238,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "property"
      ],
      "begin_line": 240,
      "end_line": 240,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.PropertyChangeSource.setProperty(java.lang.String)",
      "begin_line": 242,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 244,col 13)-(line 244,col 44)",
        "(line 245,col 13)-(line 245,col 37)",
        "(line 246,col 13)-(line 246,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.PropertyChangeSource.addVetoableChangeListener(java.beans.VetoableChangeListener)",
      "begin_line": 249,
      "end_line": 252,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.PropertyChangeSource.addPropertyChangeListener(java.beans.PropertyChangeListener)",
      "begin_line": 254,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 256,col 13)-(line 256,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.PropertyChangeSource.removePropertyChangeListener(java.beans.PropertyChangeListener)",
      "begin_line": 259,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 261,col 13)-(line 261,col 47)"
      ]
    }
  ]
}