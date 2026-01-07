{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/enums/Enum.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Enum",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable",
        "java.io.Serializable"
      ],
      "begin_line": 286,
      "end_line": 680,
      "comment": "\n * \u003cp\u003eAbstract superclass for type-safe enums.\u003c/p\u003e\n *\n * \u003cp\u003eOne feature of the C programming language lacking in Java is enumerations. The\n * C implementation based on ints was poor and open to abuse. The original Java\n * recommendation and most of the JDK also uses int constants. It has been recognised\n * however that a more robust type-safe class-based solution can be designed. This\n * class follows the basic Java type-safe enumeration pattern.\u003c/p\u003e\n *\n * \u003cp\u003e\u003cem\u003eNOTE:\u003c/em\u003e Due to the way in which Java ClassLoaders work, comparing\n * Enum objects should always be done using \u003ccode\u003eequals()\u003c/code\u003e, not \u003ccode\u003e\u003d\u003d\u003c/code\u003e.\n * The equals() method will try \u003d\u003d first so in most cases the effect is the same.\u003c/p\u003e\n * \n * \u003cp\u003eOf course, if you actually want (or don\u0027t mind) Enums in different class\n * loaders being non-equal, then you can use \u003ccode\u003e\u003d\u003d\u003c/code\u003e.\u003c/p\u003e\n * \n * \u003ch4\u003eSimple Enums\u003c/h4\u003e\n *\n * \u003cp\u003eTo use this class, it must be subclassed. For example:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * public final class ColorEnum extends Enum {\n *   public static final ColorEnum RED \u003d new ColorEnum(\"Red\");\n *   public static final ColorEnum GREEN \u003d new ColorEnum(\"Green\");\n *   public static final ColorEnum BLUE \u003d new ColorEnum(\"Blue\");\n *\n *   private ColorEnum(String color) {\n *     super(color);\n *   }\n * \n *   public static ColorEnum getEnum(String color) {\n *     return (ColorEnum) getEnum(ColorEnum.class, color);\n *   }\n * \n *   public static Map getEnumMap() {\n *     return getEnumMap(ColorEnum.class);\n *   }\n * \n *   public static List getEnumList() {\n *     return getEnumList(ColorEnum.class);\n *   }\n * \n *   public static Iterator iterator() {\n *     return iterator(ColorEnum.class);\n *   }\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003eAs shown, each enum has a name. This can be accessed using \u003ccode\u003egetName\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eThe \u003ccode\u003egetEnum\u003c/code\u003e and \u003ccode\u003eiterator\u003c/code\u003e methods are recommended.\n * Unfortunately, Java restrictions require these to be coded as shown in each subclass.\n * An alternative choice is to use the {@link EnumUtils} class.\u003c/p\u003e\n * \n * \u003ch4\u003eSubclassed Enums\u003c/h4\u003e\n * \u003cp\u003eA hierarchy of Enum classes can be built. In this case, the superclass is\n * unaffected by the addition of subclasses (as per normal Java). The subclasses\n * may add additional Enum constants \u003cem\u003eof the type of the superclass\u003c/em\u003e. The\n * query methods on the subclass will return all of the Enum constants from the\n * superclass and subclass.\u003c/p\u003e\n *\n * \u003cpre\u003e\n * public final class ExtraColorEnum extends ColorEnum {\n *   // NOTE: Color enum declared above is final, change that to get this\n *   // example to compile.\n *   public static final ColorEnum YELLOW \u003d new ExtraColorEnum(\"Yellow\");\n *\n *   private ExtraColorEnum(String color) {\n *     super(color);\n *   }\n * \n *   public static ColorEnum getEnum(String color) {\n *     return (ColorEnum) getEnum(ExtraColorEnum.class, color);\n *   }\n * \n *   public static Map getEnumMap() {\n *     return getEnumMap(ExtraColorEnum.class);\n *   }\n * \n *   public static List getEnumList() {\n *     return getEnumList(ExtraColorEnum.class);\n *   }\n * \n *   public static Iterator iterator() {\n *     return iterator(ExtraColorEnum.class);\n *   }\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003eThis example will return RED, GREEN, BLUE, YELLOW from the List and iterator\n * methods in that order. The RED, GREEN and BLUE instances will be the same (\u003d\u003d) \n * as those from the superclass ColorEnum. Note that YELLOW is declared as a\n * ColorEnum and not an ExtraColorEnum.\u003c/p\u003e\n * \n * \u003ch4\u003eFunctional Enums\u003c/h4\u003e\n *\n * \u003cp\u003eThe enums can have functionality by defining subclasses and\n * overriding the \u003ccode\u003egetEnumClass()\u003c/code\u003e method:\u003c/p\u003e\n * \n * \u003cpre\u003e\n *   public static final OperationEnum PLUS \u003d new PlusOperation();\n *   private static final class PlusOperation extends OperationEnum {\n *     private PlusOperation() {\n *       super(\"Plus\");\n *     }\n *     public int eval(int a, int b) {\n *       return a + b;\n *     }\n *   }\n *   public static final OperationEnum MINUS \u003d new MinusOperation();\n *   private static final class MinusOperation extends OperationEnum {\n *     private MinusOperation() {\n *       super(\"Minus\");\n *     }\n *     public int eval(int a, int b) {\n *       return a - b;\n *     }\n *   }\n *\n *   private OperationEnum(String color) {\n *     super(color);\n *   }\n * \n *   public final Class getEnumClass() {     // NOTE: new method!\n *     return OperationEnum.class;\n *   }\n *\n *   public abstract double eval(double a, double b);\n * \n *   public static OperationEnum getEnum(String name) {\n *     return (OperationEnum) getEnum(OperationEnum.class, name);\n *   }\n * \n *   public static Map getEnumMap() {\n *     return getEnumMap(OperationEnum.class);\n *   }\n * \n *   public static List getEnumList() {\n *     return getEnumList(OperationEnum.class);\n *   }\n * \n *   public static Iterator iterator() {\n *     return iterator(OperationEnum.class);\n *   }\n * }\n * \u003c/pre\u003e\n * \u003cp\u003eThe code above will work on JDK 1.2. If JDK1.3 and later is used,\n * the subclasses may be defined as anonymous.\u003c/p\u003e\n * \n * \u003ch4\u003eNested class Enums\u003c/h4\u003e\n *\n * \u003cp\u003eCare must be taken with class loading when defining a static nested class\n * for enums. The static nested class can be loaded without the surrounding outer\n * class being loaded. This can result in an empty list/map/iterator being returned.\n * One solution is to define a static block that references the outer class where\n * the constants are defined. For example:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * public final class Outer {\n *   public static final BWEnum BLACK \u003d new BWEnum(\"Black\");\n *   public static final BWEnum WHITE \u003d new BWEnum(\"White\");\n *\n *   // static nested enum class\n *   public static final class BWEnum extends Enum {\n * \n *     static {\n *       // explicitly reference BWEnum class to force constants to load\n *       Object obj \u003d Outer.BLACK;\n *     }\n * \n *     // ... other methods omitted\n *   }\n * }\n * \u003c/pre\u003e\n * \n * \u003cp\u003eAlthough the above solves the problem, it is not recommended. The best solution\n * is to define the constants in the enum class, and hold references in the outer class:\n *\n * \u003cpre\u003e\n * public final class Outer {\n *   public static final BWEnum BLACK \u003d BWEnum.BLACK;\n *   public static final BWEnum WHITE \u003d BWEnum.WHITE;\n *\n *   // static nested enum class\n *   public static final class BWEnum extends Enum {\n *     // only define constants in enum classes - private if desired\n *     private static final BWEnum BLACK \u003d new BWEnum(\"Black\");\n *     private static final BWEnum WHITE \u003d new BWEnum(\"White\");\n * \n *     // ... other methods omitted\n *   }\n * }\n * \u003c/pre\u003e\n * \n * \u003cp\u003eFor more details, see the \u0027Nested\u0027 test cases.\n *\n * \u003ch4\u003eLang Enums and Java 5.0 Enums\u003c/h4\u003e\n *\n * \u003cp\u003eEnums were added to Java in Java 5.0. The main differences between Lang\u0027s \n * implementation and the new official JDK implementation are: \u003c/p\u003e\n * \u003cul\u003e\n * \u003cli\u003eThe standard Enum is a not just a superclass, but is a type baked into the \n * language. \u003c/li\u003e\n * \u003cli\u003eThe standard Enum does not support extension, so the standard methods that \n * are provided in the Lang enum are not available. \u003c/li\u003e\n * \u003cli\u003eLang mandates a String name, whereas the standard Enum uses the class \n * name as its name. getName() changes to name(). \u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003eGenerally people should use the standard Enum. Migrating from the Lang \n * enum to the standard Enum is not as easy as it might be due to the lack of \n * class inheritence in standard Enums. This means that it\u0027s not possible \n * to provide a \u0027super-enum\u0027 which could provide the same utility methods \n * that the Lang enum does. The following utility class is a Java 5.0 \n * version of our EnumUtils class and provides those utility methods. \u003c/p\u003e\n *\n * \u003cpre\u003e\n * import java.util.*;\n * \n * public class EnumUtils {\n * \n *   public static Enum getEnum(Class enumClass, String token) {\n *     return Enum.valueOf(enumClass, token);\n *   }\n * \n *   public static Map getEnumMap(Class enumClass) {\n *     HashMap map \u003d new HashMap();\n *     Iterator itr \u003d EnumUtils.iterator(enumClass);\n *     while(itr.hasNext()) {\n *       Enum enm \u003d (Enum) itr.next();\n *       map.put( enm.name(), enm );\n *     }\n *     return map;\n *   }\n * \n *   public static List getEnumList(Class enumClass) {\n *     return new ArrayList( EnumSet.allOf(enumClass) );\n *   }\n * \n *   public static Iterator iterator(Class enumClass) {\n *     return EnumUtils.getEnumList(enumClass).iterator();\n *   }\n * }\n * \u003c/pre\u003e\n * \n * @author Apache Avalon project\n * @author Stephen Colebourne\n * @author Chris Webb\n * @author Mike Bowler\n * @author Matthias Eichel\n * @since 2.1 (class existed in enum package from v1.0)\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 293,
      "end_line": 293,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_MAP"
      ],
      "begin_line": 300,
      "end_line": 300,
      "comment": "\n     * An empty \u003ccode\u003eMap\u003c/code\u003e, as JDK1.2 didn\u0027t have an empty map.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cEnumClasses"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": "\n     * \u003ccode\u003eMap\u003c/code\u003e, key of class name, value of \u003ccode\u003eEntry\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iName"
      ],
      "begin_line": 310,
      "end_line": 310,
      "comment": "\n     * The string representation of the Enum.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iHashCode"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": "\n     * The hashcode representation of the Enum.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iToString"
      ],
      "begin_line": 321,
      "end_line": 321,
      "comment": "\n     * The toString representation of the Enum.\n     * @since 2.0\n     "
    },
    {
      "type": "class_interface",
      "name": "Entry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 326,
      "end_line": 350,
      "comment": "\n     * \u003cp\u003eEnable the iterator to retain the source code order.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 330,
      "end_line": 330,
      "comment": "\n         * Map of Enum name to Enum.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "unmodifiableMap"
      ],
      "begin_line": 334,
      "end_line": 334,
      "comment": "\n         * Map of Enum name to Enum.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "list"
      ],
      "begin_line": 338,
      "end_line": 338,
      "comment": "\n         * List of Enums in source code order.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "unmodifiableList"
      ],
      "begin_line": 342,
      "end_line": 342,
      "comment": "\n         * Map of Enum name to Enum.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.enums.Enum.Entry.Entry()",
      "begin_line": 347,
      "end_line": 349,
      "comment": "\n         * \u003cp\u003eRestrictive constructor.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 348,col 11)-(line 348,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.enums.Enum.Enum(java.lang.String)",
      "begin_line": 362,
      "end_line": 368,
      "comment": "\n     * \u003cp\u003eConstructor to add a new named item to the enumeration.\u003c/p\u003e\n     *\n     * @param name  the name of the enum object,\n     *  must not be empty or \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the name is \u003ccode\u003enull\u003c/code\u003e\n     *  or an empty string\n     * @throws IllegalArgumentException if the getEnumClass() method returns\n     *  a null or invalid Class\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 16)",
        "(line 364,col 9)-(line 364,col 19)",
        "(line 365,col 9)-(line 365,col 21)",
        "(line 366,col 9)-(line 366,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.init(java.lang.String)",
      "begin_line": 377,
      "end_line": 410,
      "comment": "\n     * Initializes the enumeration.\n     * \n     * @param name  the enum name\n     * @throws IllegalArgumentException if the name is null or empty or duplicate\n     * @throws IllegalArgumentException if the enumClass is null or invalid\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 380,col 9)",
        "(line 382,col 9)-(line 382,col 41)",
        "(line 383,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 31)",
        "(line 387,col 9)-(line 387,col 27)",
        "(line 388,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 397,col 9)",
        "(line 400,col 9)-(line 400,col 58)",
        "(line 401,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 34)",
        "(line 409,col 9)-(line 409,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.readResolve()",
      "begin_line": 418,
      "end_line": 424,
      "comment": "\n     * \u003cp\u003eHandle the deserialization of the class to ensure that multiple\n     * copies are not wastefully created, or illegal enum types created.\u003c/p\u003e\n     *\n     * @return the resolved object\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 63)",
        "(line 420,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 423,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.getEnum(java.lang.Class, java.lang.String)",
      "begin_line": 439,
      "end_line": 445,
      "comment": "\n     * \u003cp\u003eGets an \u003ccode\u003eEnum\u003c/code\u003e object by class and name.\u003c/p\u003e\n     * \n     * @param enumClass  the class of the Enum to get, must not\n     *  be \u003ccode\u003enull\u003c/code\u003e\n     * @param name  the name of the \u003ccode\u003eEnum\u003c/code\u003e to get,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the enum object, or \u003ccode\u003enull\u003c/code\u003e if the enum does not exist\n     * @throws IllegalArgumentException if the enum class\n     *  is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 42)",
        "(line 441,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 444,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.getEnumMap(java.lang.Class)",
      "begin_line": 460,
      "end_line": 466,
      "comment": "\n     * \u003cp\u003eGets the \u003ccode\u003eMap\u003c/code\u003e of \u003ccode\u003eEnum\u003c/code\u003e objects by\n     * name using the \u003ccode\u003eEnum\u003c/code\u003e class.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the requested class has no enum objects an empty\n     * \u003ccode\u003eMap\u003c/code\u003e is returned.\u003c/p\u003e\n     * \n     * @param enumClass  the class of the \u003ccode\u003eEnum\u003c/code\u003e to get,\n     *  must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return the enum object Map\n     * @throws IllegalArgumentException if the enum class is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the enum class is not a subclass of Enum\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 42)",
        "(line 462,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 465,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.getEnumList(java.lang.Class)",
      "begin_line": 482,
      "end_line": 488,
      "comment": "\n     * \u003cp\u003eGets the \u003ccode\u003eList\u003c/code\u003e of \u003ccode\u003eEnum\u003c/code\u003e objects using the\n     * \u003ccode\u003eEnum\u003c/code\u003e class.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe list is in the order that the objects were created (source code order).\n     * If the requested class has no enum objects an empty \u003ccode\u003eList\u003c/code\u003e is\n     * returned.\u003c/p\u003e\n     * \n     * @param enumClass  the class of the \u003ccode\u003eEnum\u003c/code\u003e to get,\n     *  must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return the enum object Map\n     * @throws IllegalArgumentException if the enum class is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the enum class is not a subclass of Enum\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 42)",
        "(line 484,col 9)-(line 486,col 9)",
        "(line 487,col 9)-(line 487,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.iterator(java.lang.Class)",
      "begin_line": 504,
      "end_line": 506,
      "comment": "\n     * \u003cp\u003eGets an \u003ccode\u003eIterator\u003c/code\u003e over the \u003ccode\u003eEnum\u003c/code\u003e objects in\n     * an \u003ccode\u003eEnum\u003c/code\u003e class.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe \u003ccode\u003eIterator\u003c/code\u003e is in the order that the objects were\n     * created (source code order). If the requested class has no enum\n     * objects an empty \u003ccode\u003eIterator\u003c/code\u003e is returned.\u003c/p\u003e\n     * \n     * @param enumClass  the class of the \u003ccode\u003eEnum\u003c/code\u003e to get,\n     *  must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return an iterator of the Enum objects\n     * @throws IllegalArgumentException if the enum class is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the enum class is not a subclass of Enum\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.getEntry(java.lang.Class)",
      "begin_line": 515,
      "end_line": 524,
      "comment": "\n     * \u003cp\u003eGets an \u003ccode\u003eEntry\u003c/code\u003e from the map of Enums.\u003c/p\u003e\n     * \n     * @param enumClass  the class of the \u003ccode\u003eEnum\u003c/code\u003e to get\n     * @return the enum entry\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 521,col 9)",
        "(line 522,col 9)-(line 522,col 58)",
        "(line 523,col 9)-(line 523,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.createEntry(java.lang.Class)",
      "begin_line": 534,
      "end_line": 547,
      "comment": "\n     * \u003cp\u003eCreates an \u003ccode\u003eEntry\u003c/code\u003e for storing the Enums.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis accounts for subclassed Enums.\u003c/p\u003e\n     * \n     * @param enumClass  the class of the \u003ccode\u003eEnum\u003c/code\u003e to get\n     * @return the enum entry\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 34)",
        "(line 536,col 9)-(line 536,col 46)",
        "(line 537,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 546,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.getName()",
      "begin_line": 555,
      "end_line": 557,
      "comment": "\n     * \u003cp\u003eRetrieve the name of this Enum item, set in the constructor.\u003c/p\u003e\n     * \n     * @return the \u003ccode\u003eString\u003c/code\u003e name of this Enum item\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.getEnumClass()",
      "begin_line": 569,
      "end_line": 571,
      "comment": "\n     * \u003cp\u003eRetrieves the Class of this Enum item, set in the constructor.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis is normally the same as \u003ccode\u003egetClass()\u003c/code\u003e, but for\n     * advanced Enums may be different. If overridden, it must return a\n     * constant value.\u003c/p\u003e\n     * \n     * @return the \u003ccode\u003eClass\u003c/code\u003e of the enum\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.equals(java.lang.Object)",
      "begin_line": 586,
      "end_line": 603,
      "comment": "\n     * \u003cp\u003eTests for equality.\u003c/p\u003e\n     *\n     * \u003cp\u003eTwo Enum objects are considered equal\n     * if they have the same class names and the same names.\n     * Identity is tested for first, so this method usually runs fast.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the parameter is in a different class loader than this instance,\n     * reflection is used to compare the names.\u003c/p\u003e\n     *\n     * @param other  the other object to compare for equality\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the Enums are equal\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 602,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.hashCode()",
      "begin_line": 610,
      "end_line": 612,
      "comment": "\n     * \u003cp\u003eReturns a suitable hashCode for the enumeration.\u003c/p\u003e\n     *\n     * @return a hashcode based on the name\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.compareTo(java.lang.Object)",
      "begin_line": 630,
      "end_line": 642,
      "comment": "\n     * \u003cp\u003eTests for order.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe default ordering is alphabetic by name, but this\n     * can be overridden by subclasses.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the parameter is in a different class loader than this instance,\n     * reflection is used to compare the names.\u003c/p\u003e\n     *\n     * @see java.lang.Comparable#compareTo(Object)\n     * @param other  the other object to compare to\n     * @return -ve if this is less than the other object, +ve if greater\n     *  than, \u003ccode\u003e0\u003c/code\u003e of equal\n     * @throws ClassCastException if other is not an Enum\n     * @throws NullPointerException if other is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 631,col 9)-(line 633,col 9)",
        "(line 634,col 9)-(line 640,col 9)",
        "(line 641,col 9)-(line 641,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.getNameInOtherClassLoader(java.lang.Object)",
      "begin_line": 650,
      "end_line": 663,
      "comment": "\n     * \u003cp\u003eUse reflection to return an objects class name.\u003c/p\u003e\n     *\n     * @param other The object to determine the class name for\n     * @return The class name\n     ",
      "child_ranges": [
        "(line 651,col 9)-(line 661,col 9)",
        "(line 662,col 9)-(line 662,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.toString()",
      "begin_line": 672,
      "end_line": 678,
      "comment": "\n     * \u003cp\u003eHuman readable description of this Enum item.\u003c/p\u003e\n     * \n     * @return String in the form \u003ccode\u003etype[name]\u003c/code\u003e, for example:\n     * \u003ccode\u003eColor[Red]\u003c/code\u003e. Note that the package name is stripped from\n     * the type name.\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 676,col 9)",
        "(line 677,col 9)-(line 677,col 25)"
      ]
    }
  ]
}