package online.food.ordering;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class Ordering", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
@javax.persistence.Entity
@javax.persistence.Table(name="Ordering")
public class Ordering extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -186847857568896906L;

  /**
   * Identifier
   */
  @javax.persistence.Id
  @javax.persistence.GeneratedValue
  private java.lang.Integer id;

  /**
   * Gets the field id.
   * @return the value of the field id; may be null.
   */
  public java.lang.Integer getId()
  {
    return id;
  }

  /**
   * Sets the field id.
   * @param _id the new value of the field id.
   */
  public void setId(java.lang.Integer _id)
  {
    id = _id;
  }

  private java.lang.Integer restaurantId;

  /**
   * Gets the field restaurantId.
   * @return the value of the field restaurantId; may be null.
   */
  public java.lang.Integer getRestaurantId()
  {
    return restaurantId;
  }

  /**
   * Sets the field restaurantId.
   * @param _restaurantId the new value of the field restaurantId.
   */
  public void setRestaurantId(java.lang.Integer _restaurantId)
  {
    restaurantId = _restaurantId;
  }

  private java.lang.Integer foodId;

  /**
   * Gets the field foodId.
   * @return the value of the field foodId; may be null.
   */
  public java.lang.Integer getFoodId()
  {
    return foodId;
  }

  /**
   * Sets the field foodId.
   * @param _foodId the new value of the field foodId.
   */
  public void setFoodId(java.lang.Integer _foodId)
  {
    foodId = _foodId;
  }

  private java.lang.String optional;

  /**
   * Gets the field optional.
   * @return the value of the field optional; may be null.
   */
  public java.lang.String getOptional()
  {
    return optional;
  }

  /**
   * Sets the field optional.
   * @param _optional the new value of the field optional.
   */
  public void setOptional(java.lang.String _optional)
  {
    optional = _optional;
  }

  private java.lang.String notice;

  /**
   * Gets the field notice.
   * @return the value of the field notice; may be null.
   */
  public java.lang.String getNotice()
  {
    return notice;
  }

  /**
   * Sets the field notice.
   * @param _notice the new value of the field notice.
   */
  public void setNotice(java.lang.String _notice)
  {
    notice = _notice;
  }

  private java.lang.String personName;

  /**
   * Gets the field personName.
   * @return the value of the field personName; may be null.
   */
  public java.lang.String getPersonName()
  {
    return personName;
  }

  /**
   * Sets the field personName.
   * @param _personName the new value of the field personName.
   */
  public void setPersonName(java.lang.String _personName)
  {
    personName = _personName;
  }

}
