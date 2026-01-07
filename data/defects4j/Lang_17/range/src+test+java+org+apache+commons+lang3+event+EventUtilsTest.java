{
  "filepath": "/tmp/Lang-17b/src/test/java/org/apache/commons/lang3/event/EventUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EventUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 39,
      "end_line": 265,
      "comment": "\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testConstructor()",
      "begin_line": 42,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 40)",
        "(line 44,col 9)-(line 44,col 75)",
        "(line 45,col 9)-(line 45,col 37)",
        "(line 46,col 9)-(line 46,col 70)",
        "(line 47,col 9)-(line 47,col 79)",
        "(line 48,col 9)-(line 48,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testAddEventListener()",
      "begin_line": 51,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 68)",
        "(line 54,col 9)-(line 54,col 88)",
        "(line 55,col 9)-(line 55,col 95)",
        "(line 56,col 9)-(line 56,col 65)",
        "(line 57,col 9)-(line 57,col 81)",
        "(line 58,col 9)-(line 58,col 65)",
        "(line 59,col 9)-(line 59,col 36)",
        "(line 60,col 9)-(line 60,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testAddEventListenerWithNoAddMethod()",
      "begin_line": 63,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 68)",
        "(line 66,col 9)-(line 66,col 88)",
        "(line 67,col 9)-(line 67,col 91)",
        "(line 68,col 9)-(line 76,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testAddEventListenerThrowsException()",
      "begin_line": 79,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 68)",
        "(line 82,col 9)-(line 96,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.Anonymous-dac49ba6-3d1c-4a3e-add8-b6b5f71223b2.propertyChange(java.beans.PropertyChangeEvent)",
      "begin_line": 86,
      "end_line": 89,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testAddEventListenerWithPrivateAddMethod()",
      "begin_line": 99,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 68)",
        "(line 102,col 9)-(line 102,col 88)",
        "(line 103,col 9)-(line 103,col 95)",
        "(line 104,col 9)-(line 112,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testBindEventsToMethod()",
      "begin_line": 115,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 68)",
        "(line 118,col 9)-(line 118,col 56)",
        "(line 119,col 9)-(line 119,col 99)",
        "(line 120,col 9)-(line 120,col 44)",
        "(line 121,col 9)-(line 121,col 36)",
        "(line 122,col 9)-(line 122,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testBindEventsToMethodWithEvent()",
      "begin_line": 126,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 68)",
        "(line 129,col 9)-(line 129,col 74)",
        "(line 130,col 9)-(line 130,col 99)",
        "(line 131,col 9)-(line 131,col 44)",
        "(line 132,col 9)-(line 132,col 36)",
        "(line 133,col 9)-(line 133,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testBindFilteredEventsToMethod()",
      "begin_line": 137,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 66)",
        "(line 140,col 9)-(line 140,col 56)",
        "(line 141,col 9)-(line 141,col 108)",
        "(line 142,col 9)-(line 142,col 44)",
        "(line 143,col 9)-(line 143,col 120)",
        "(line 144,col 9)-(line 144,col 44)",
        "(line 145,col 9)-(line 145,col 120)",
        "(line 146,col 9)-(line 146,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultipleEventListener",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 149,
      "end_line": 154,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.MultipleEventListener.event1(java.beans.PropertyChangeEvent)",
      "begin_line": 151,
      "end_line": 151,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.MultipleEventListener.event2(java.beans.PropertyChangeEvent)",
      "begin_line": 153,
      "end_line": 153,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "EventCounter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 156,
      "end_line": 169,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCounter.eventOccurred()",
      "begin_line": 160,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 13)-(line 162,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCounter.getCount()",
      "begin_line": 165,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 167,col 13)-(line 167,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EventCounterWithEvent",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 171,
      "end_line": 184,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCounterWithEvent.eventOccurred(java.beans.PropertyChangeEvent)",
      "begin_line": 175,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 177,col 13)-(line 177,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCounterWithEvent.getCount()",
      "begin_line": 180,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 182,col 13)-(line 182,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EventCountingInvociationHandler",
      "is_interface": false,
      "parent_types": [
        "java.lang.reflect.InvocationHandler"
      ],
      "begin_line": 187,
      "end_line": 217,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "eventCounts"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCountingInvociationHandler.createListener(java.lang.Class\u003cL\u003e)",
      "begin_line": 191,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 193,col 13)-(line 195,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCountingInvociationHandler.getEventCount(java.lang.String)",
      "begin_line": 198,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 200,col 13)-(line 200,col 55)",
        "(line 201,col 13)-(line 201,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCountingInvociationHandler.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])",
      "begin_line": 204,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 206,col 13)-(line 206,col 62)",
        "(line 207,col 13)-(line 214,col 13)",
        "(line 215,col 13)-(line 215,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultipleEventSource",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 219,
      "end_line": 227,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "listeners"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.MultipleEventSource.addMultipleEventListener(org.apache.commons.lang3.event.EventUtilsTest.MultipleEventListener)",
      "begin_line": 223,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 225,col 13)-(line 225,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExceptionEventSource",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 229,
      "end_line": 235,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.ExceptionEventSource.addPropertyChangeListener(java.beans.PropertyChangeListener)",
      "begin_line": 231,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 233,col 13)-(line 233,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PropertyChangeSource",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 237,
      "end_line": 264,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "listeners"
      ],
      "begin_line": 239,
      "end_line": 239,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "property"
      ],
      "begin_line": 241,
      "end_line": 241,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.PropertyChangeSource.setProperty(java.lang.String)",
      "begin_line": 243,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 245,col 13)-(line 245,col 44)",
        "(line 246,col 13)-(line 246,col 37)",
        "(line 247,col 13)-(line 247,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.PropertyChangeSource.addVetoableChangeListener(java.beans.VetoableChangeListener)",
      "begin_line": 250,
      "end_line": 253,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.PropertyChangeSource.addPropertyChangeListener(java.beans.PropertyChangeListener)",
      "begin_line": 255,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 257,col 13)-(line 257,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.PropertyChangeSource.removePropertyChangeListener(java.beans.PropertyChangeListener)",
      "begin_line": 260,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 262,col 13)-(line 262,col 47)"
      ]
    }
  ]
}