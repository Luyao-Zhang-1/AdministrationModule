// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mendixsso.proxies;

public class AdditionalScopes
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject additionalScopesMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MendixSSO.AdditionalScopes";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		AdditionalScopes("AdditionalScopes");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public AdditionalScopes(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MendixSSO.AdditionalScopes"));
	}

	protected AdditionalScopes(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject additionalScopesMendixObject)
	{
		if (additionalScopesMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MendixSSO.AdditionalScopes", additionalScopesMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MendixSSO.AdditionalScopes");

		this.additionalScopesMendixObject = additionalScopesMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'AdditionalScopes.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static mendixsso.proxies.AdditionalScopes initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mendixsso.proxies.AdditionalScopes.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mendixsso.proxies.AdditionalScopes initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mendixsso.proxies.AdditionalScopes(context, mendixObject);
	}

	public static mendixsso.proxies.AdditionalScopes load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mendixsso.proxies.AdditionalScopes.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of AdditionalScopes
	 */
	public final java.lang.String getAdditionalScopes()
	{
		return getAdditionalScopes(getContext());
	}

	/**
	 * @param context
	 * @return value of AdditionalScopes
	 */
	public final java.lang.String getAdditionalScopes(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.AdditionalScopes.toString());
	}

	/**
	 * Set value of AdditionalScopes
	 * @param additionalscopes
	 */
	public final void setAdditionalScopes(java.lang.String additionalscopes)
	{
		setAdditionalScopes(getContext(), additionalscopes);
	}

	/**
	 * Set value of AdditionalScopes
	 * @param context
	 * @param additionalscopes
	 */
	public final void setAdditionalScopes(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String additionalscopes)
	{
		getMendixObject().setValue(context, MemberNames.AdditionalScopes.toString(), additionalscopes);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return additionalScopesMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final mendixsso.proxies.AdditionalScopes that = (mendixsso.proxies.AdditionalScopes) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MendixSSO.AdditionalScopes";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
